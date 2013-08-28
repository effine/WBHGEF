/**
 * @author  arno
 * @version	 2013-6-14  ÉÏÎç10:20:08
 */

package wbhgef.editpart;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import wbhgef.figure.EmployeeFigure;
import wbhgef.model.Employee;
import wbhgef.model.Node;

public class EmployeePart extends AbstractGraphicalEditPart {
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		IFigure figure = new EmployeeFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}

	protected void refreshVisuals() {
		EmployeeFigure figure = (EmployeeFigure) getFigure();
		Employee model = (Employee) getModel();
		figure.setName(model.getName());
		figure.setFirstName(model.getPrenom());
		figure.setLayout(model.getLayout());
	}

	public List<Node> getModelChildren() {
		return new ArrayList<Node>();
	}
}