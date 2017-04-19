<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Modal -->
<div class="modal fade" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h2 class="modal-title" id="exampleModalLabel">Log in...</h2>
      </div>
      <div class="modal-body">
      	<form action="Login" method="post">
      		<div class="form-group row text-right">
      			<label class="col-md-3">Username: </label>
      			<input class="col-md-8" type="text" name="username" required />
      		</div>
      		<div class="form-group row text-right">
      			<label class="col-md-3">Password: </label>
      			<input class="col-md-8" type="password" name="password" required />
      		</div>
      		<div class="text-right">
        		<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>	
        		<button type="submit" class="btn btn-success">Log in</button>
      		</div>
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