package io.github.solclient.lwjgl;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class BuildPlugin implements Plugin<Project> {

	@Override
	public void apply(Project project) {
		project.getTasks().register("build").get().dependsOn(project.getTasks().register("assemble").get().dependsOn(project.getTasks().register("patch", PatchTask.class)));
	}

}
