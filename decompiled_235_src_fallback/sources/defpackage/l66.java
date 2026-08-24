package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l66  reason: default package */
/* loaded from: classes.dex */
public final class l66 extends android.database.sqlite.SQLiteOpenHelper {
    public static final java.util.List L = null;
    public final int A;
    public boolean B;

    static {
            k66 r0 = defpackage.k66.b
            k66 r1 = defpackage.k66.c
            k66 r2 = defpackage.k66.d
            k66 r3 = defpackage.k66.e
            k66[] r0 = new defpackage.k66[]{r0, r1, r2, r3}
            java.util.List r0 = java.util.Arrays.asList(r0)
            defpackage.l66.L = r0
            return
    }

    public l66(android.content.Context r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r4, r0, r3)
            r2 = 0
            r1.B = r2
            r1.A = r3
            return
    }

    public static void e(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
            java.util.List r0 = defpackage.l66.L
            int r1 = r0.size()
            if (r6 > r1) goto L58
        L8:
            if (r5 >= r6) goto L57
            java.lang.Object r1 = r0.get(r5)
            k66 r1 = (defpackage.k66) r1
            int r1 = r1.a
            switch(r1) {
                case 0: goto L3b;
                case 1: goto L2b;
                case 2: goto L25;
                default: goto L15;
            }
        L15:
            java.lang.String r1 = "ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1"
            r4.execSQL(r1)
            java.lang.String r1 = "DROP TABLE IF EXISTS event_payloads"
            r4.execSQL(r1)
            java.lang.String r1 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))"
            r4.execSQL(r1)
            goto L54
        L25:
            java.lang.String r1 = "ALTER TABLE events ADD COLUMN payload_encoding TEXT"
            r4.execSQL(r1)
            goto L54
        L2b:
            java.lang.String r1 = "ALTER TABLE transport_contexts ADD COLUMN extras BLOB"
            r4.execSQL(r1)
            java.lang.String r1 = "CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)"
            r4.execSQL(r1)
            java.lang.String r1 = "DROP INDEX contexts_backend_priority"
            r4.execSQL(r1)
            goto L54
        L3b:
            java.lang.String r1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)"
            r4.execSQL(r1)
            java.lang.String r1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)"
            r4.execSQL(r1)
            java.lang.String r1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)"
            r4.execSQL(r1)
            java.lang.String r1 = "CREATE INDEX events_backend_id on events(context_id)"
            r4.execSQL(r1)
            java.lang.String r1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)"
            r4.execSQL(r1)
        L54:
            int r5 = r5 + 1
            goto L8
        L57:
            return
        L58:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r1 = " to "
            java.lang.String r2 = " was requested, but cannot be performed. Only "
            java.lang.String r3 = "Migration from "
            java.lang.StringBuilder r5 = defpackage.i61.q(r5, r6, r3, r1, r2)
            int r6 = r0.size()
            r5.append(r6)
            java.lang.String r6 = " migrations are provided"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            r0 = 1
            r2.B = r0
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r1 = "PRAGMA busy_timeout=0;"
            android.database.Cursor r2 = r3.rawQuery(r1, r2)
            r2.close()
            r3.setForeignKeyConstraintsEnabled(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 != 0) goto L7
            r1.onConfigure(r2)
        L7:
            r0 = 0
            int r1 = r1.A
            e(r2, r0, r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE events"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE event_metadata"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE transport_contexts"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS event_payloads"
            r1.execSQL(r2)
            boolean r2 = r0.B
            if (r2 != 0) goto L1b
            r0.onConfigure(r1)
        L1b:
            r0 = 0
            e(r1, r0, r3)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 != 0) goto L7
            r1.onConfigure(r2)
        L7:
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 != 0) goto L7
            r1.onConfigure(r2)
        L7:
            e(r2, r3, r4)
            return
    }
}
