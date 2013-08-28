/**
 * @author  arno
 * @version	 2013-6-14  ÉÏÎç10:17:27
 */

package wbhgef.editpart;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import wbhgef.figure.ServiceFigure;
import wbhgef.model.Node;
import wbhgef.model.Service;

public class ServicePart extends AbstractGraphicalEditPart {
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		IFigure figure = new ServiceFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}

	protected void refreshVisuals() {
		ServiceFigure figure = (ServiceFigure) getFigure();
		Service model = (Service) getModel();
		figure.setName(model.getName());
		figure.setEtage(model.getEtage());
		figure.setLayout(model.getLayout());
	}

	public List<Node> getModelChildren() {
		return ((Service) getModel()).getChildrenArray();
	}
}