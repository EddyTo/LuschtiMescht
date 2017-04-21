<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Modal -->
<div class="modal fade" id="modal-delete-user" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h3 class="modal-title" id="exampleModalLabel">${login}, are you sure you want to delete your account?</h3>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      	<form action="DeleteUser" method="post">
   			<label>Type your password before confirm.</label>
			<br />
      		<div class="form-group row text-right">
      			<label class="col-md-3">Password: </label>
      			<input class="col-md-8" type="password" name="password" required />
      		</div>
      		<div class="text-right">
        		<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>	
        		<button type="submit" class="btn btn-danger">Yes</button>
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