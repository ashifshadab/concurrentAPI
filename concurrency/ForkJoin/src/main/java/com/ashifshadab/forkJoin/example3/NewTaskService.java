package com.ashifshadab.forkJoin.example3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class NewTaskService extends RecursiveAction {

	private int range = 0;

	public NewTaskService(int range) {
		this.range = range;
	}

	@Override
	protected void compute() {

		List<NewTaskService> subTasksList = new ArrayList<NewTaskService>();

		subTasksList.addAll(genSubtasks());

		// calculating size of the list
		int size = subTasksList.size();

		for (int i = 0; i < size; i++) {
			// forking tasks into smaller subtasks
			subTasksList.get(i).fork();
		}

	}

	// method to generate and add the subtasks
	private Collection<? extends NewTaskService> genSubtasks() {

		// creating the subtasks
		List<NewTaskService> subTasksList = new ArrayList<NewTaskService>();
		NewTaskService subTaskA = new NewTaskService(this.range / 5);
		NewTaskService subtaskB = new NewTaskService(this.range / 5);
		NewTaskService subtaskC = new NewTaskService(this.range / 5);
		NewTaskService subtaskD = new NewTaskService(this.range / 5);
		NewTaskService subtaskE = new NewTaskService(this.range / 5);

		// add the created subtasks
		subTasksList.add(subTaskA);
		subTasksList.add(subtaskB);
		subTasksList.add(subtaskC);
		subTasksList.add(subtaskD);
		subTasksList.add(subtaskE);

		return subTasksList;
	}

}
