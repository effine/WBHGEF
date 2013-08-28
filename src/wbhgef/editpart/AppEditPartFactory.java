/**
 * @author  arno
 * @version	 2013-6-14  上午09:44:35
 */

package wbhgef.editpart;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import wbhgef.model.Employee;
import wbhgef.model.Enterprise;
import wbhgef.model.Service;

public class AppEditPartFactory implements EditPartFactory {
	/*
	 * 第一次调用的
	 * 
	 * @Override public EditPart createEditPart(EditPart context, Object model)
	 * { AbstractGraphicalEditPart part = null; if (model instanceof Enterprise)
	 * { part = new EnterprisePart(); } part.setModel(model); return part; }
	 */
	
	
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
	// TODO Auto-generated method stub
	AbstractGraphicalEditPart part = null;
	if(model instanceof Enterprise) {
	part = new EnterprisePart();
	} else if(model instanceof Service) {
	part = new ServicePart();
	} else if(model instanceof Employee) {
	part = new EmployeePart();
	}
	part.setModel(model);
	return part;
	}
}