package edu.kis.powp.jobs2d.command.transformations;

import edu.kis.powp.jobs2d.command.CommandCoordinatesVisitor;
import edu.kis.powp.jobs2d.command.ICompoundCommand;

public interface ITransformation {

	public ICompoundCommand transform(CommandCoordinatesVisitor visitor);
}
