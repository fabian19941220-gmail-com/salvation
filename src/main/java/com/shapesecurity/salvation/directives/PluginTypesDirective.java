package com.shapesecurity.salvation.directives;

import com.shapesecurity.salvation.directiveValues.MediaType;

import javax.annotation.Nonnull;
import java.util.Set;

public class PluginTypesDirective extends MediaTypeListDirective {
	@Nonnull
	private static final String name = "plugin-types";

	public PluginTypesDirective(@Nonnull Set<MediaType> mediaTypes) {
		super(PluginTypesDirective.name, mediaTypes);
	}

	@Nonnull
	@Override
	public Directive<MediaType> construct(Set<MediaType> newValues) {
		return new PluginTypesDirective(newValues);
	}
}
