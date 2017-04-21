<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Modal -->
<div class="modal fade" id="modal-confirm-password" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h3 class="modal-title" id="exampleModalLabel">C0nf1rm t0 c0nt1nu3</h3>
        
      
      </div>
      <div class="modal-body">
      	<form action="UpdateUser" method="post">
   			<label>7yp3 y0ur pa$$w0rd:</label>
			<br />
      		<div class="form-group row text-right">
      			<label class="col-md-3">P4$$w0rd: </label>
      			<input class="col-md-8" type="password" name="pwd" required />
      		</div>
      		<div class="text-right">
        		<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>	
        		<button type="submit" class="btn btn-danger">C0nf1rm</button>
      		</div>
      		
      		<input type="text" id="reception-email" name="reception-email" class="hidden" />
      	</form>
      	
      	
      </div>
      
      <div class="modal-footer">
      	<c:if test="${not empty message}">
      		<div class="alert alert-danger text-left">
      			<strong>WRONG!</strong> ${message}
      		</div>
      	</c:if>
      </div>
    </div>
  </div>
</div>