//$HeadURL$
/*----------------------------------------------------------------------------
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2009 by:
   Department of Geography, University of Bonn
 and
   lat/lon GmbH

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
----------------------------------------------------------------------------*/
package org.deegree.model.coverage.grid;

import java.io.Serializable;

/**
 * Describes the geometry and georeferencing information of the grid coverage. The grid range
 * attribute determines the valid grid coordinates and allows for calculation of grid size. A grid
 * coverage may or may not have georeferencing.
 *
 * @version $Revision$
 * @author <a href="mailto:poth@lat-lon.de">Andreas Poth</a>
 * @author last edited by: $Author$
 *
 * @version 1.0. $Revision$, $Date$
 *
 * @since 2.0
 */

class GridGeometry implements Serializable {

    private static final long serialVersionUID = -1854324911295104602L;

    private GridRange gridRange = null;

    /**
     *
     * @param gridRange
     */
    GridGeometry( GridRange gridRange ) {
        this.gridRange = gridRange;
    }

    /**
     * The valid coordinate range of a grid coverage. The lowest valid grid coordinate is zero. A
     * grid with 512 cells can have a minimum coordinate of 0 and maximum of 512, with 511 as the
     * highest valid index.
     *
     * @return The valid coordinate range of a grid coverage
     *
     */
    public GridRange getGridRange() {
        return gridRange;
    }

}
