package dbmigrate.model.operation;

import dbmigrate.model.db.ITable;

import dbmigrate.model.db.ITable;

public class DropTableOperationDescriptor extends TableOperationDescriptor
		implements IOperationDescriptor {

	public DropTableOperationDescriptor() {
		super();
	}

	public DropTableOperationDescriptor(ITable table) {
		super(table);
	}

}
