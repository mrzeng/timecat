package com.time.cat.data.model.events;

import com.time.cat.data.model.DBmodel.DBNote;
import com.time.cat.data.model.DBmodel.DBRoutine;
import com.time.cat.data.model.DBmodel.DBTask;
import com.time.cat.data.model.DBmodel.DBUser;
import com.time.cat.data.model.APImodel.Task;

/**
 * @author dlink
 * @date 2018/2/4
 * @discription PersistenceEvents
 */
public class PersistenceEvents {

    public static ModelCreateOrUpdateEvent ROUTINE_EVENT = new ModelCreateOrUpdateEvent(DBRoutine.class);
    public static ModelCreateOrUpdateEvent SCHEDULE_EVENT = new ModelCreateOrUpdateEvent(Task.class);
    public static ModelCreateOrUpdateEvent NOTE_EVENT = new ModelCreateOrUpdateEvent(DBNote.class);


    public static class ModelCreateOrUpdateEvent {
        public Class<?> clazz;

        public ModelCreateOrUpdateEvent(Class<?> clazz) {
            this.clazz = clazz;
        }
    }

    public static class MedicineAddedEvent {

        public Long id;

        public MedicineAddedEvent(Long id) {
            this.id = id;
        }
    }

    public static class UserCreateEvent {
        public DBUser user;

        public UserCreateEvent(DBUser user) {
            this.user = user;
        }
    }

    public static class UserUpdateEvent {
        public DBUser user;

        public UserUpdateEvent(DBUser user) {
            this.user = user;
        }
    }

    public static class ActiveUserChangeEvent {
        public DBUser user;

        public ActiveUserChangeEvent(DBUser user) {
            this.user = user;
        }
    }

    public static class NoteCreateEvent {
        public DBNote note;

        public NoteCreateEvent(DBNote note) {
            this.note = note;
        }
    }

    public static class NoteUpdateEvent {
        public DBNote note;

        public NoteUpdateEvent(DBNote note) {
            this.note = note;
        }
    }

    public static class TaskCreateEvent {
        public DBTask task;

        public TaskCreateEvent(DBTask task) {
            this.task = task;
        }
    }

    public static class TaskUpdateEvent {
        public DBTask task;

        public TaskUpdateEvent(DBTask task) {
            this.task = task;
        }
    }
}