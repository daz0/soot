/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Jennifer Lhotak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package soot.jimple.toolkits.annotation;
import soot.*;

import java.util.*;
import soot.toolkits.graph.*;
import soot.util.Chain;
import soot.jimple.*;
import soot.options.*;
import soot.jimple.toolkits.pointer.*;
import soot.jimple.toolkits.scalar.*;

/** A body transformer that records avail expression 
 * information in tags.  - both pessimistic and optimistic options*/
public class FuncParamChecker extends BodyTransformer
{ 
	public FuncParamChecker( Singletons.Global g ) {}
    public static FuncParamChecker v() { return G.v().soot_jimple_toolkits_annotation_FuncParamChecker(); }

    protected void internalTransform(
            Body b, String phaseName, Map opts)
    {

    	System.out.println("ZWB - Signature of current method" + b.getMethod().getSignature());
    	System.out.println("ZWB - SubSignature of current method: " + b.getMethod().getSubSignature());
    	System.out.println(b.toString());
    	
    	Chain<Unit> units = b.getUnits();

        for (Unit currentStmt : units) {
        	Stmt stmt = (Stmt)currentStmt;
        	if (stmt.containsInvokeExpr()) {
        		System.out.println(stmt.toString());
        	}
        }
    	
    }
}


