package io.toadlabs.lwjgl;

import org.gradle.api.*;

public final class BuildPlugin implements Plugin<Project> {

	@Override
	public void apply(Project project) {
		project.getTasks().register("build").get().dependsOn(project.getTasks().register("assemble").get()
				.dependsOn(project.getTasks().register("patch", PatchTask.class)));
	}

}
