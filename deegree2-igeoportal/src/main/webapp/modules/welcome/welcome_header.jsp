<%-- $HeadURL$ --%>
<%-- $Id$ --%>
<%-- 
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2009 by:
 - Department of Geography, University of Bonn -
 and
 - lat/lon GmbH -

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option)
 any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 details.
 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation, Inc.,
 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Contact information:

 lat/lon GmbH
 Aennchenstr. 19, 53177 Bonn
 Germany
 http://lat-lon.de/

 Department of Geography, University of Bonn
 Prof. Dr. Klaus Greve
 Postfach 1147, 53001 Bonn
 Germany
 http://www.geographie.uni-bonn.de/deegree/

 e-mail: info@deegree.org
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isErrorPage="false" errorPage="welcome_error.jsp" %>
<%@ page import="org.deegree.framework.version.*" %>
<html>
    <head>
        <title>deegree <%=Version.getVersionNumber()%></title>
        <link rel="stylesheet" href="../../css/deegree.css" />
    </head>
    <body>
        <table width="100%">
            <tr>
                <td align="left" style="width:210px">
                    <a href="http://deegree.org/" target="_blank"><img src="../../images/logo-deegree.png" height="48" width="200" alt="deegree"/></a>
                </td>
                <td align="center">
                    <p align="center">&nbsp;<%--=Version.getVersion()--%></p>                
                </td>
                <td align="right" style="width:210px">
                    <a href="http://www.osgeo.org/deegree" target="_blank"><img src="../../images/OSGeo_project.png" height="85" width="200" alt="The OSGeo Foundation"/></a>&nbsp;
                </td>
             </tr>
        </table>
    </body>
</html>