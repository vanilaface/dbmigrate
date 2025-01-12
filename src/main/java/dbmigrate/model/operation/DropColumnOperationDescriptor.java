package dbmigrate.model.operation;

import dbmigrate.model.db.IColumn;
import dbmigrate.model.db.ITable;

import dbmigrate.model.db.IColumn;
import dbmigrate.model.db.ITable;

public class DropColumnOperationDescriptor extends ColumnOperationDescriptor
		implements IOperationDescriptor {

	public DropColumnOperationDescriptor() {
		super();
	}

	public DropColumnOperationDescriptor(ITable table, IColumn column) {
		super(table, column);
	}

}
