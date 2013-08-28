package wbhgef;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * @author arno
 * @version 2013-6-13 ÉÏÎç10:25:49
 */

public class MyEditorInput implements IEditorInput {

	public String name = "arno";

	public MyEditorInput(String name) {
		name = this.name;
	}

	public boolean equals(Object o) {

		if (!(o instanceof MyEditorInput)) {
			return false;
		}
		return ((MyEditorInput) o).getName().equals(getName());
	}

	@Override
	public Object getAdapter(Class arg0) {

		return null;
	}

	@Override
	public boolean exists() {

		return (this.name != null);
	}

	@Override
	public ImageDescriptor getImageDescriptor() {

		return ImageDescriptor.getMissingImageDescriptor();
	}

	@Override
	public String getName() {

		return this.name;
	}

	@Override
	public IPersistableElement getPersistable() {

		return null;
	}

	@Override
	public String getToolTipText() {

		return this.name;
	}

}
