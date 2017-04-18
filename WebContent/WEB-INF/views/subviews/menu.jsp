<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="<c:url value="/"/>">LuschtiMescht</a>
		</div>
		
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<c:if test="${login != null}">
				</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:if test="${empty login}">
					<li><a href="<c:url value="/"/>">Subscribe</a></li>
					<c:import url="../subviews/modal_login.jsp" />
					<li><a href="" id="link-modal-log-in" data-toggle="modal" data-target="#modal-login">Log in</a></li>
				</c:if>
				<c:if test="${not empty login}">
					<li><a href="<c:url value="/"/>">${login}</a></li>
					<li><a href="<c:url value="/Logout"/>">Log out</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</nav>
<c:if test="${displayModalLogIn == true}">
	<script type="text/javascript">displayModalLogIn();</script>
</c:if>
