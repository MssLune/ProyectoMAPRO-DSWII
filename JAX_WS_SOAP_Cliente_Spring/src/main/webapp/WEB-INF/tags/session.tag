										

		
												<displaySession:table name="${sessionScope.boleta}" class="dataTable" style="width: 60%" id="bean">
													<displaySession:column property="codigo" title="ID" sortable="true"/>
													<displaySession:column property="nombre" title="NOMBRE" sortable="true"/>
													<displaySession:column property="precio" title="COSTO DE REGISTRO" sortable="true"/>
													<displaySession:column title="IMPORTE">
														${bean.precio*1.18}
													</displaySession:column>
													<displaySession:column>
														<a href="boleta?metodo=elimina&id=${bean.codigo}">Eliminar</a>
													</displaySession:column>    
												</displaySession:table>