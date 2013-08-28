/**
 * @author  arno
 * @version	 2013-6-13  ����09:33:44
 */

package wbhgef;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GEF;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;

import wbhgef.editpart.AppEditPartFactory;
import wbhgef.model.Employee;
import wbhgef.model.Enterprise;
import wbhgef.model.Service;

public class MyGraphicalEditor extends GraphicalEditor {

	public static final String ID = "WBHGEF.mygraphicaleditor";

	public MyGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void initializeGraphicalViewer() {
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setContents(CreateEnterprise());
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new AppEditPartFactory());
	}

	public Enterprise CreateEnterprise() {
		/*
		 * ��һ�ε���
		 * 
		 * Enterprise enterprise = new Enterprise();
		 * enterprise.setName("Weapon Workshop");
		 * enterprise.setAddress("Rd ChangAn No.1");
		 * enterprise.setCapital(8000000); return enterprise;
		 */

		Enterprise enterprise = new Enterprise();
		enterprise.setName("ͬ����ջ");
		enterprise.setAddress("�����ߺ�ͬ�ߺ�");
		enterprise.setCapital(8000000);
		Service service_QianTang = new Service();
		service_QianTang.setName("ǰ��");
		service_QianTang.setEtage(2);
		service_QianTang.setLayout(new Rectangle(30, 50, 250, 150));
		Employee empolyee_1 = new Employee();
		empolyee_1.setName("�ƹ�");
		empolyee_1.setPrenom("١");
		empolyee_1.setLayout(new Rectangle(25, 40, 60, 40));
		service_QianTang.addChild(empolyee_1);
		Employee empolyee_2 = new Employee();
		empolyee_2.setName("չ��");
		empolyee_2.setPrenom("��");
		empolyee_2.setLayout(new Rectangle(100, 60, 60, 40));
		service_QianTang.addChild(empolyee_2);
		Employee empolyee_3 = new Employee();
		empolyee_3.setName("���");
		empolyee_3.setPrenom("��");
		empolyee_3.setLayout(new Rectangle(180, 90, 60, 40));
		service_QianTang.addChild(empolyee_3);
		enterprise.addChild(service_QianTang);
		Service service_HouChu = new Service();
		service_HouChu.setName("���");
		service_HouChu.setEtage(1);
		service_HouChu.setLayout(new Rectangle(220, 230, 250, 150));
		Employee employee_4 = new Employee();
		employee_4.setName("����");
		employee_4.setPrenom("��");
		employee_4.setLayout(new Rectangle(40, 70, 60, 40));
		service_HouChu.addChild(employee_4);
		Employee employee_5 = new Employee();
		employee_5.setName("ܽ��");
		employee_5.setPrenom("��");
		employee_5.setLayout(new Rectangle(170, 100, 60, 40));
		service_HouChu.addChild(employee_5);
		enterprise.addChild(service_HouChu);
		return enterprise;
	}

}
