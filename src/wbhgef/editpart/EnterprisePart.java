/**
 * @author  arno
 * @version	 2013-6-14  上午09:43:22
 */

package wbhgef.editpart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import wbhgef.figure.EnterpriseFigure;
import wbhgef.model.Enterprise;
import wbhgef.model.Node;

public class EnterprisePart extends AbstractGraphicalEditPart {
	@Override
	protected IFigure createFigure() {
		IFigure figure = new EnterpriseFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {

	}

	protected void refreshVisuals() {
		EnterpriseFigure figure = (EnterpriseFigure) getFigure();
		Enterprise model = (Enterprise) getModel();
		figure.setName(model.getName());
		figure.setAddress(model.getAddress());
		figure.setCapital(model.getCapital());
	}

	public List<Node> getModelChildren() {
		// return new ArrayList<Node>();	第一次使用的
		return ((Enterprise) getModel()).getChildrenArray();
	}
}