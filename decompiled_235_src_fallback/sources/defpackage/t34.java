package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t34  reason: default package */
/* loaded from: classes.dex */
public final class t34 extends defpackage.ts1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ defpackage.m16 e;

    public t34(androidx.work.impl.WorkDatabase_Impl r3) {
            r2 = this;
            r0 = 1
            r2.d = r0
            r2.e = r3
            java.lang.String r3 = "08b926448d86528e697981ddd30459f7"
            java.lang.String r0 = "149fd8ad55885d3fe3549a37a0163243"
            r1 = 24
            r2.<init>(r3, r1, r0)
            return
    }

    public t34(me.magnum.melonds.database.MelonDatabase_Impl r3) {
            r2 = this;
            r0 = 0
            r2.d = r0
            r2.e = r3
            java.lang.String r3 = "87f13c623fa68b88b9c3e9bff84b16cd"
            java.lang.String r0 = "67e37bbfd69943fb82d1c33201fa5bf9"
            r1 = 9
            r2.<init>(r3, r1, r0)
            return
    }

    private final defpackage.g60 w(defpackage.e36 r24) {
            r23 = this;
            r0 = r24
            r0.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r2 = new ny6
            r7 = 0
            r8 = 1
            java.lang.String r3 = "id"
            java.lang.String r4 = "INTEGER"
            r5 = 0
            r6 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = "id"
            r1.put(r3, r2)
            ny6 r4 = new ny6
            r9 = 0
            r10 = 1
            java.lang.String r5 = "name"
            java.lang.String r6 = "TEXT"
            r7 = 1
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = "name"
            r1.put(r2, r4)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            py6 r6 = new py6
            java.util.List r7 = defpackage.hf.b0(r2)
            java.lang.String r8 = "ASC"
            java.util.List r9 = defpackage.hf.b0(r8)
            java.lang.String r10 = "index_cheat_database_name"
            r11 = 1
            r6.<init>(r10, r11, r7, r9)
            r5.add(r6)
            qy6 r6 = new qy6
            java.lang.String r7 = "cheat_database"
            r6.<init>(r7, r1, r4, r5)
            qy6 r1 = defpackage.kn2.X(r0, r7)
            boolean r4 = r6.equals(r1)
            java.lang.String r5 = "\n Found:\n"
            r7 = 0
            if (r4 != 0) goto L7b
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cheat_database(me.magnum.melonds.database.entities.CheatDatabaseEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r6)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L7b:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "id"
            java.lang.String r14 = "INTEGER"
            r15 = 0
            r16 = 1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r3, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "name"
            java.lang.String r15 = "TEXT"
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.put(r2, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "game_code"
            java.lang.String r16 = "TEXT"
            r17 = 1
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r4 = "game_code"
            r1.put(r4, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            java.lang.String r16 = "game_checksum"
            java.lang.String r17 = "TEXT"
            r18 = 1
            r19 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r6 = "game_checksum"
            r1.put(r6, r15)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            py6 r12 = new py6
            java.lang.String[] r4 = new java.lang.String[]{r4, r6}
            java.util.List r4 = defpackage.hf.c0(r4)
            java.lang.String[] r6 = new java.lang.String[]{r8, r8}
            java.util.List r6 = defpackage.hf.c0(r6)
            java.lang.String r13 = "game_code_checksum_index"
            r12.<init>(r13, r11, r4, r6)
            r10.add(r12)
            qy6 r4 = new qy6
            java.lang.String r6 = "game"
            r4.<init>(r6, r1, r9, r10)
            qy6 r1 = defpackage.kn2.X(r0, r6)
            boolean r6 = r4.equals(r1)
            if (r6 != 0) goto L120
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "game(me.magnum.melonds.database.entities.GameEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L120:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "id"
            java.lang.String r14 = "INTEGER"
            r15 = 0
            r16 = 1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r3, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "game_id"
            java.lang.String r15 = "INTEGER"
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r4 = "game_id"
            r1.put(r4, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "name"
            java.lang.String r16 = "TEXT"
            r17 = 1
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1.put(r2, r14)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            oy6 r12 = new oy6
            java.util.List r16 = defpackage.hf.b0(r4)
            java.util.List r17 = defpackage.hf.b0(r3)
            java.lang.String r13 = "game"
            java.lang.String r14 = "CASCADE"
            java.lang.String r15 = "NO ACTION"
            r12.<init>(r13, r14, r15, r16, r17)
            r6.add(r12)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            py6 r10 = new py6
            java.util.List r12 = defpackage.hf.b0(r4)
            java.util.List r13 = defpackage.hf.b0(r8)
            java.lang.String r14 = "index_cheat_folder_game_id"
            r10.<init>(r14, r7, r12, r13)
            r9.add(r10)
            qy6 r10 = new qy6
            java.lang.String r12 = "cheat_folder"
            r10.<init>(r12, r1, r6, r9)
            qy6 r1 = defpackage.kn2.X(r0, r12)
            boolean r6 = r10.equals(r1)
            if (r6 != 0) goto L1bd
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cheat_folder(me.magnum.melonds.database.entities.CheatFolderEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r10)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L1bd:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "id"
            java.lang.String r14 = "INTEGER"
            r15 = 0
            r16 = 1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r3, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "cheat_folder_id"
            java.lang.String r15 = "INTEGER"
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r6 = "cheat_folder_id"
            r1.put(r6, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "cheat_database_id"
            java.lang.String r16 = "INTEGER"
            r17 = 1
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r9 = "cheat_database_id"
            r1.put(r9, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            java.lang.String r16 = "name"
            java.lang.String r17 = "TEXT"
            r18 = 1
            r19 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r1.put(r2, r15)
            ny6 r16 = new ny6
            r21 = 0
            r22 = 1
            java.lang.String r17 = "description"
            java.lang.String r18 = "TEXT"
            r20 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2 = r16
            java.lang.String r10 = "description"
            r1.put(r10, r2)
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "code"
            java.lang.String r14 = "TEXT"
            r15 = 1
            r16 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.String r2 = "code"
            r1.put(r2, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "enabled"
            java.lang.String r15 = "INTEGER"
            r16 = 1
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "enabled"
            r1.put(r2, r13)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            oy6 r12 = new oy6
            java.util.List r16 = defpackage.hf.b0(r6)
            java.util.List r17 = defpackage.hf.b0(r3)
            java.lang.String r13 = "cheat_folder"
            java.lang.String r14 = "CASCADE"
            java.lang.String r15 = "NO ACTION"
            r12.<init>(r13, r14, r15, r16, r17)
            r2.add(r12)
            oy6 r13 = new oy6
            java.util.List r17 = defpackage.hf.b0(r9)
            java.util.List r18 = defpackage.hf.b0(r3)
            java.lang.String r14 = "cheat_database"
            java.lang.String r15 = "CASCADE"
            java.lang.String r16 = "NO ACTION"
            r13.<init>(r14, r15, r16, r17, r18)
            r2.add(r13)
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            py6 r13 = new py6
            java.util.List r6 = defpackage.hf.b0(r6)
            java.util.List r14 = defpackage.hf.b0(r8)
            java.lang.String r15 = "index_cheat_cheat_folder_id"
            r13.<init>(r15, r7, r6, r14)
            r12.add(r13)
            py6 r6 = new py6
            java.util.List r9 = defpackage.hf.b0(r9)
            java.util.List r13 = defpackage.hf.b0(r8)
            java.lang.String r14 = "index_cheat_cheat_database_id"
            r6.<init>(r14, r7, r9, r13)
            r12.add(r6)
            qy6 r6 = new qy6
            java.lang.String r9 = "cheat"
            r6.<init>(r9, r1, r2, r12)
            qy6 r1 = defpackage.kn2.X(r0, r9)
            boolean r2 = r6.equals(r1)
            if (r2 != 0) goto L2d9
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cheat(me.magnum.melonds.database.entities.CheatEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r6)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L2d9:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "game_id"
            java.lang.String r14 = "INTEGER"
            r15 = 1
            r16 = 1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r4, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "rich_presence_patch"
            java.lang.String r15 = "TEXT"
            r16 = 0
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "rich_presence_patch"
            r1.put(r2, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "title"
            java.lang.String r16 = "TEXT"
            r17 = 1
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r2 = "title"
            r1.put(r2, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            java.lang.String r16 = "icon"
            java.lang.String r17 = "TEXT"
            r18 = 1
            r19 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r6 = "icon"
            r1.put(r6, r15)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            qy6 r12 = new qy6
            java.lang.String r13 = "ra_game"
            r12.<init>(r13, r1, r6, r9)
            qy6 r1 = defpackage.kn2.X(r0, r13)
            boolean r6 = r12.equals(r1)
            if (r6 != 0) goto L368
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ra_game(me.magnum.melonds.database.entities.retroachievements.RAGameEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r12)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L368:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "id"
            java.lang.String r14 = "INTEGER"
            r15 = 1
            r16 = 1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r3, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "game_id"
            java.lang.String r15 = "INTEGER"
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.put(r4, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "title"
            java.lang.String r16 = "TEXT"
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1.put(r2, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            java.lang.String r16 = "type"
            java.lang.String r17 = "TEXT"
            r18 = 1
            r19 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r6 = "type"
            r1.put(r6, r15)
            ny6 r16 = new ny6
            r21 = 0
            r22 = 1
            java.lang.String r17 = "icon_url"
            java.lang.String r18 = "TEXT"
            r19 = 1
            r20 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r9 = r16
            java.lang.String r12 = "icon_url"
            r1.put(r12, r9)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            py6 r13 = new py6
            java.util.List r14 = defpackage.hf.b0(r4)
            java.util.List r15 = defpackage.hf.b0(r8)
            java.lang.String r11 = "index_ra_achievement_set_game_id"
            r13.<init>(r11, r7, r14, r15)
            r12.add(r13)
            qy6 r11 = new qy6
            java.lang.String r13 = "ra_achievement_set"
            r11.<init>(r13, r1, r9, r12)
            qy6 r1 = defpackage.kn2.X(r0, r13)
            boolean r9 = r11.equals(r1)
            if (r9 != 0) goto L419
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ra_achievement_set(me.magnum.melonds.database.entities.retroachievements.RAAchievementSetEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r11)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L419:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r11 = new ny6
            r16 = 0
            r17 = 1
            r14 = 1
            r15 = 1
            java.lang.String r12 = "id"
            java.lang.String r13 = "INTEGER"
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.put(r3, r11)
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            r16 = 0
            java.lang.String r13 = "game_id"
            java.lang.String r14 = "INTEGER"
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r4, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            r16 = 1
            r17 = 0
            java.lang.String r14 = "set_id"
            java.lang.String r15 = "INTEGER"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r9 = "set_id"
            r1.put(r9, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "total_awards_casual"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r11 = "total_awards_casual"
            r1.put(r11, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "total_awards_hardcore"
            java.lang.String r17 = "INTEGER"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r11 = "total_awards_hardcore"
            r1.put(r11, r15)
            ny6 r16 = new ny6
            r21 = 0
            r22 = 1
            r19 = 1
            r20 = 0
            java.lang.String r17 = "title"
            java.lang.String r18 = "TEXT"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r11 = r16
            r1.put(r2, r11)
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            r15 = 1
            r16 = 0
            java.lang.String r13 = "description"
            java.lang.String r14 = "TEXT"
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r10, r12)
            ny6 r13 = new ny6
            r18 = 0
            r16 = 1
            r17 = 0
            java.lang.String r14 = "points"
            java.lang.String r15 = "INTEGER"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r11 = "points"
            r1.put(r11, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "display_order"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r11 = "display_order"
            r1.put(r11, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "badge_url_unlocked"
            java.lang.String r17 = "TEXT"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r11 = "badge_url_unlocked"
            r1.put(r11, r15)
            ny6 r16 = new ny6
            r21 = 0
            r19 = 1
            r20 = 0
            java.lang.String r17 = "badge_url_locked"
            java.lang.String r18 = "TEXT"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r11 = r16
            java.lang.String r12 = "badge_url_locked"
            r1.put(r12, r11)
            ny6 r13 = new ny6
            r18 = 0
            r16 = 1
            r17 = 0
            java.lang.String r14 = "memory_address"
            java.lang.String r15 = "TEXT"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r11 = "memory_address"
            r1.put(r11, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "type"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1.put(r6, r14)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            py6 r12 = new py6
            java.util.List r13 = defpackage.hf.b0(r9)
            java.util.List r14 = defpackage.hf.b0(r8)
            java.lang.String r15 = "index_ra_achievement_set_id"
            r12.<init>(r15, r7, r13, r14)
            r11.add(r12)
            qy6 r12 = new qy6
            java.lang.String r13 = "ra_achievement"
            r12.<init>(r13, r1, r6, r11)
            qy6 r1 = defpackage.kn2.X(r0, r13)
            boolean r6 = r12.equals(r1)
            if (r6 != 0) goto L572
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ra_achievement(me.magnum.melonds.database.entities.retroachievements.RAAchievementEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r12)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L572:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r11 = new ny6
            r16 = 0
            r17 = 1
            java.lang.String r12 = "game_id"
            java.lang.String r13 = "INTEGER"
            r14 = 1
            r15 = 1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.put(r4, r11)
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "achievement_id"
            java.lang.String r14 = "INTEGER"
            r16 = 2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.String r6 = "achievement_id"
            r1.put(r6, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "is_unlocked"
            java.lang.String r15 = "INTEGER"
            r16 = 1
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r11 = "is_unlocked"
            r1.put(r11, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "is_hardcore"
            java.lang.String r16 = "INTEGER"
            r17 = 1
            r18 = 3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r11 = "is_hardcore"
            r1.put(r11, r14)
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            qy6 r13 = new qy6
            java.lang.String r14 = "ra_user_achievement"
            r13.<init>(r14, r1, r11, r12)
            qy6 r1 = defpackage.kn2.X(r0, r14)
            boolean r11 = r13.equals(r1)
            if (r11 != 0) goto L5fe
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ra_user_achievement(me.magnum.melonds.database.entities.retroachievements.RAUserAchievementEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r13)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L5fe:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r11 = new ny6
            r16 = 0
            r17 = 1
            java.lang.String r12 = "id"
            java.lang.String r13 = "INTEGER"
            r14 = 1
            r15 = 1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.put(r3, r11)
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "game_id"
            java.lang.String r14 = "INTEGER"
            r16 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r4, r12)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "set_id"
            java.lang.String r15 = "INTEGER"
            r16 = 1
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.put(r9, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "mem"
            java.lang.String r16 = "TEXT"
            r17 = 1
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r3 = "mem"
            r1.put(r3, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            java.lang.String r16 = "format"
            java.lang.String r17 = "TEXT"
            r18 = 1
            r19 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = "format"
            r1.put(r3, r15)
            ny6 r16 = new ny6
            r21 = 0
            r22 = 1
            java.lang.String r17 = "lower_is_better"
            java.lang.String r18 = "INTEGER"
            r19 = 1
            r20 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3 = r16
            java.lang.String r11 = "lower_is_better"
            r1.put(r11, r3)
            ny6 r12 = new ny6
            r17 = 0
            r18 = 1
            java.lang.String r13 = "title"
            java.lang.String r14 = "TEXT"
            r15 = 1
            r16 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.put(r2, r12)
            ny6 r13 = new ny6
            r18 = 0
            java.lang.String r14 = "description"
            java.lang.String r15 = "TEXT"
            r16 = 1
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.put(r10, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "hidden"
            java.lang.String r16 = "INTEGER"
            r17 = 1
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r2 = "hidden"
            r1.put(r2, r14)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            py6 r10 = new py6
            java.util.List r9 = defpackage.hf.b0(r9)
            java.util.List r8 = defpackage.hf.b0(r8)
            java.lang.String r11 = "index_ra_leaderboard_set_id"
            r10.<init>(r11, r7, r9, r8)
            r3.add(r10)
            qy6 r8 = new qy6
            java.lang.String r9 = "ra_leaderboard"
            r8.<init>(r9, r1, r2, r3)
            qy6 r1 = defpackage.kn2.X(r0, r9)
            boolean r2 = r8.equals(r1)
            if (r2 != 0) goto L701
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ra_leaderboard(me.magnum.melonds.database.entities.retroachievements.RALeaderboardEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L701:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r8 = new ny6
            r13 = 0
            r14 = 1
            java.lang.String r9 = "game_id"
            java.lang.String r10 = "INTEGER"
            r11 = 1
            r12 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.put(r4, r8)
            ny6 r9 = new ny6
            r14 = 0
            r15 = 1
            java.lang.String r10 = "last_achievement_set_updated"
            java.lang.String r11 = "INTEGER"
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.lang.String r2 = "last_achievement_set_updated"
            r1.put(r2, r9)
            ny6 r10 = new ny6
            r15 = 0
            r16 = 1
            java.lang.String r11 = "last_user_data_updated"
            java.lang.String r12 = "INTEGER"
            r14 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "last_user_data_updated"
            r1.put(r2, r10)
            ny6 r11 = new ny6
            r16 = 0
            r17 = 1
            java.lang.String r12 = "last_hardcore_user_data_updated"
            java.lang.String r13 = "INTEGER"
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.String r2 = "last_hardcore_user_data_updated"
            r1.put(r2, r11)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            qy6 r8 = new qy6
            java.lang.String r9 = "ra_game_set_metadata"
            r8.<init>(r9, r1, r2, r3)
            qy6 r1 = defpackage.kn2.X(r0, r9)
            boolean r2 = r8.equals(r1)
            if (r2 != 0) goto L782
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ra_game_set_metadata(me.magnum.melonds.database.entities.retroachievements.RAGameSetMetadata).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L782:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r8 = new ny6
            r13 = 0
            r14 = 1
            java.lang.String r9 = "game_hash"
            java.lang.String r10 = "TEXT"
            r11 = 1
            r12 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.lang.String r2 = "game_hash"
            r1.put(r2, r8)
            ny6 r9 = new ny6
            r14 = 0
            r15 = 1
            java.lang.String r10 = "game_id"
            java.lang.String r11 = "INTEGER"
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.put(r4, r9)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            qy6 r8 = new qy6
            java.lang.String r9 = "ra_game_hash_library"
            r8.<init>(r9, r1, r2, r3)
            qy6 r1 = defpackage.kn2.X(r0, r9)
            boolean r2 = r8.equals(r1)
            if (r2 != 0) goto L7dd
            g60 r0 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ra_game_hash_library(me.magnum.melonds.database.entities.retroachievements.RAGameHashEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            return r0
        L7dd:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            ny6 r8 = new ny6
            r13 = 0
            r14 = 1
            java.lang.String r9 = "achievement_id"
            java.lang.String r10 = "INTEGER"
            r11 = 1
            r12 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.put(r6, r8)
            ny6 r9 = new ny6
            r14 = 0
            r15 = 1
            java.lang.String r10 = "game_id"
            java.lang.String r11 = "INTEGER"
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.put(r4, r9)
            ny6 r10 = new ny6
            r15 = 0
            r16 = 1
            java.lang.String r11 = "for_hardcore_mode"
            java.lang.String r12 = "INTEGER"
            r13 = 1
            r14 = 2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "for_hardcore_mode"
            r1.put(r2, r10)
            ny6 r11 = new ny6
            java.lang.String r16 = "0"
            r17 = 1
            java.lang.String r12 = "created_at_epoch_ms"
            java.lang.String r13 = "INTEGER"
            r14 = 1
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.String r2 = "created_at_epoch_ms"
            r1.put(r2, r11)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            qy6 r4 = new qy6
            java.lang.String r6 = "ra_pending_achievement_award"
            r4.<init>(r6, r1, r2, r3)
            qy6 r0 = defpackage.kn2.X(r0, r6)
            boolean r1 = r4.equals(r0)
            if (r1 != 0) goto L85d
            g60 r1 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ra_pending_achievement_award(me.magnum.melonds.database.entities.retroachievements.RAPendingAchievementSubmissionEntity).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r7)
            return r1
        L85d:
            g60 r0 = new g60
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.ts1
    public final void a(defpackage.e36 r2) {
            r1 = this;
            int r1 = r1.d
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r2.getClass()
            switch(r1) {
                case 0: goto L54;
                default: goto La;
            }
        La:
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"
            defpackage.ii2.s(r2, r1)
            defpackage.ii2.s(r2, r0)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')"
            defpackage.ii2.s(r2, r1)
            return
        L54:
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `cheat_database` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE UNIQUE INDEX IF NOT EXISTS `index_cheat_database_name` ON `cheat_database` (`name`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `game` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `game_code` TEXT NOT NULL, `game_checksum` TEXT NOT NULL)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE UNIQUE INDEX IF NOT EXISTS `game_code_checksum_index` ON `game` (`game_code`, `game_checksum`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `cheat_folder` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `game_id` INTEGER NOT NULL, `name` TEXT NOT NULL, FOREIGN KEY(`game_id`) REFERENCES `game`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_cheat_folder_game_id` ON `cheat_folder` (`game_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `cheat` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `cheat_folder_id` INTEGER NOT NULL, `cheat_database_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `code` TEXT NOT NULL, `enabled` INTEGER NOT NULL, FOREIGN KEY(`cheat_folder_id`) REFERENCES `cheat_folder`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`cheat_database_id`) REFERENCES `cheat_database`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_cheat_cheat_folder_id` ON `cheat` (`cheat_folder_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_cheat_cheat_database_id` ON `cheat` (`cheat_database_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `ra_game` (`game_id` INTEGER NOT NULL, `rich_presence_patch` TEXT, `title` TEXT NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`game_id`))"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `ra_achievement_set` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `title` TEXT, `type` TEXT NOT NULL, `icon_url` TEXT NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_game_id` ON `ra_achievement_set` (`game_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `ra_achievement` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `total_awards_casual` INTEGER NOT NULL, `total_awards_hardcore` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `points` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, `badge_url_unlocked` TEXT NOT NULL, `badge_url_locked` TEXT NOT NULL, `memory_address` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_ra_achievement_set_id` ON `ra_achievement` (`set_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `ra_user_achievement` (`game_id` INTEGER NOT NULL, `achievement_id` INTEGER NOT NULL, `is_unlocked` INTEGER NOT NULL, `is_hardcore` INTEGER NOT NULL, PRIMARY KEY(`game_id`, `achievement_id`, `is_hardcore`))"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `ra_leaderboard` (`id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `mem` TEXT NOT NULL, `format` TEXT NOT NULL, `lower_is_better` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`id`))"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS `index_ra_leaderboard_set_id` ON `ra_leaderboard` (`set_id`)"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `ra_game_set_metadata` (`game_id` INTEGER NOT NULL, `last_achievement_set_updated` INTEGER, `last_user_data_updated` INTEGER, `last_hardcore_user_data_updated` INTEGER, PRIMARY KEY(`game_id`))"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `ra_game_hash_library` (`game_hash` TEXT NOT NULL, `game_id` INTEGER NOT NULL, PRIMARY KEY(`game_hash`))"
            defpackage.ii2.s(r2, r1)
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS `ra_pending_achievement_award` (`achievement_id` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `for_hardcore_mode` INTEGER NOT NULL, `created_at_epoch_ms` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`achievement_id`, `for_hardcore_mode`))"
            defpackage.ii2.s(r2, r1)
            defpackage.ii2.s(r2, r0)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '87f13c623fa68b88b9c3e9bff84b16cd')"
            defpackage.ii2.s(r2, r1)
            return
    }

    @Override // defpackage.ts1
    public final void c(defpackage.e36 r1) {
            r0 = this;
            int r0 = r0.d
            r1.getClass()
            switch(r0) {
                case 0: goto L2c;
                default: goto L8;
            }
        L8:
            java.lang.String r0 = "DROP TABLE IF EXISTS `Dependency`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkSpec`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkTag`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `SystemIdInfo`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkName`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkProgress`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `Preference`"
            defpackage.ii2.s(r1, r0)
            return
        L2c:
            java.lang.String r0 = "DROP TABLE IF EXISTS `cheat_database`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `game`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `cheat_folder`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `cheat`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `ra_game`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `ra_achievement_set`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `ra_achievement`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `ra_user_achievement`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `ra_leaderboard`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `ra_game_set_metadata`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `ra_game_hash_library`"
            defpackage.ii2.s(r1, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `ra_pending_achievement_award`"
            defpackage.ii2.s(r1, r0)
            return
    }

    @Override // defpackage.ts1
    public final void r(defpackage.e36 r1) {
            r0 = this;
            int r0 = r0.d
            r1.getClass()
            return
    }

    @Override // defpackage.ts1
    public final void s(defpackage.e36 r3) {
            r2 = this;
            int r0 = r2.d
            m16 r2 = r2.e
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r3.getClass()
            switch(r0) {
                case 0: goto L15;
                default: goto Lc;
            }
        Lc:
            defpackage.ii2.s(r3, r1)
            androidx.work.impl.WorkDatabase_Impl r2 = (androidx.work.impl.WorkDatabase_Impl) r2
            r2.m(r3)
            return
        L15:
            defpackage.ii2.s(r3, r1)
            me.magnum.melonds.database.MelonDatabase_Impl r2 = (me.magnum.melonds.database.MelonDatabase_Impl) r2
            r2.m(r3)
            return
    }

    @Override // defpackage.ts1
    public final void t(defpackage.e36 r1) {
            r0 = this;
            int r0 = r0.d
            r1.getClass()
            return
    }

    @Override // defpackage.ts1
    public final void u(defpackage.e36 r1) {
            r0 = this;
            int r0 = r0.d
            r1.getClass()
            switch(r0) {
                case 0: goto Lc;
                default: goto L8;
            }
        L8:
            defpackage.hv.z(r1)
            return
        Lc:
            defpackage.hv.z(r1)
            return
    }

    @Override // defpackage.ts1
    public final defpackage.g60 v(defpackage.e36 r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.d
            switch(r2) {
                case 0: goto L66c;
                default: goto L9;
            }
        L9:
            r1.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            ny6 r2 = new ny6
            r7 = 0
            r8 = 1
            java.lang.String r3 = "work_spec_id"
            java.lang.String r4 = "TEXT"
            r5 = 1
            r6 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = "work_spec_id"
            r0.put(r3, r2)
            ny6 r4 = new ny6
            r9 = 0
            r10 = 1
            java.lang.String r5 = "prerequisite_id"
            java.lang.String r6 = "TEXT"
            r7 = 1
            r8 = 2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = "prerequisite_id"
            r0.put(r2, r4)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            oy6 r5 = new oy6
            java.util.List r9 = defpackage.hf.b0(r3)
            java.lang.String r11 = "id"
            java.util.List r10 = defpackage.hf.b0(r11)
            java.lang.String r6 = "WorkSpec"
            java.lang.String r7 = "CASCADE"
            java.lang.String r8 = "CASCADE"
            r5.<init>(r6, r7, r8, r9, r10)
            r4.add(r5)
            oy6 r12 = new oy6
            java.util.List r16 = defpackage.hf.b0(r2)
            java.util.List r17 = defpackage.hf.b0(r11)
            java.lang.String r13 = "WorkSpec"
            java.lang.String r14 = "CASCADE"
            java.lang.String r15 = "CASCADE"
            r12.<init>(r13, r14, r15, r16, r17)
            r4.add(r12)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            py6 r6 = new py6
            java.util.List r7 = defpackage.hf.b0(r3)
            java.lang.String r8 = "ASC"
            java.util.List r9 = defpackage.hf.b0(r8)
            java.lang.String r10 = "index_Dependency_work_spec_id"
            r12 = 0
            r6.<init>(r10, r12, r7, r9)
            r5.add(r6)
            py6 r6 = new py6
            java.util.List r2 = defpackage.hf.b0(r2)
            java.util.List r7 = defpackage.hf.b0(r8)
            java.lang.String r9 = "index_Dependency_prerequisite_id"
            r6.<init>(r9, r12, r2, r7)
            r5.add(r6)
            qy6 r2 = new qy6
            java.lang.String r6 = "Dependency"
            r2.<init>(r6, r0, r4, r5)
            qy6 r0 = defpackage.kn2.X(r1, r6)
            boolean r4 = r2.equals(r0)
            java.lang.String r5 = "\n Found:\n"
            if (r4 != 0) goto Lc2
            g60 r1 = new g60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n"
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0, r12)
            goto L66b
        Lc2:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            r16 = 1
            r17 = 1
            java.lang.String r14 = "id"
            java.lang.String r15 = "TEXT"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.put(r11, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            r18 = 0
            java.lang.String r15 = "state"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r2 = "state"
            r0.put(r2, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "worker_class_name"
            java.lang.String r17 = "TEXT"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r2 = "worker_class_name"
            r0.put(r2, r15)
            ny6 r16 = new ny6
            r21 = 0
            r22 = 1
            r19 = 1
            r20 = 0
            java.lang.String r17 = "input_merger_class_name"
            java.lang.String r18 = "TEXT"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2 = r16
            java.lang.String r4 = "input_merger_class_name"
            r0.put(r4, r2)
            ny6 r13 = new ny6
            r18 = 0
            r16 = 1
            r17 = 0
            java.lang.String r14 = "input"
            java.lang.String r15 = "BLOB"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "input"
            r0.put(r2, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "output"
            java.lang.String r16 = "BLOB"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r2 = "output"
            r0.put(r2, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "initial_delay"
            java.lang.String r17 = "INTEGER"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r2 = "initial_delay"
            r0.put(r2, r15)
            ny6 r16 = new ny6
            r21 = 0
            r19 = 1
            r20 = 0
            java.lang.String r17 = "interval_duration"
            java.lang.String r18 = "INTEGER"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2 = r16
            java.lang.String r4 = "interval_duration"
            r0.put(r4, r2)
            ny6 r13 = new ny6
            r18 = 0
            r16 = 1
            r17 = 0
            java.lang.String r14 = "flex_duration"
            java.lang.String r15 = "INTEGER"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "flex_duration"
            r0.put(r2, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "run_attempt_count"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r2 = "run_attempt_count"
            r0.put(r2, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "backoff_policy"
            java.lang.String r17 = "INTEGER"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r2 = "backoff_policy"
            r0.put(r2, r15)
            ny6 r16 = new ny6
            r21 = 0
            r19 = 1
            r20 = 0
            java.lang.String r17 = "backoff_delay_duration"
            java.lang.String r18 = "INTEGER"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2 = r16
            java.lang.String r4 = "backoff_delay_duration"
            r0.put(r4, r2)
            ny6 r13 = new ny6
            java.lang.String r18 = "-1"
            r16 = 1
            r17 = 0
            java.lang.String r14 = "last_enqueue_time"
            java.lang.String r15 = "INTEGER"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "last_enqueue_time"
            r0.put(r2, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "minimum_retention_duration"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r4 = "minimum_retention_duration"
            r0.put(r4, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "schedule_requested_at"
            java.lang.String r17 = "INTEGER"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r4 = "schedule_requested_at"
            r0.put(r4, r15)
            ny6 r16 = new ny6
            r21 = 0
            r19 = 1
            r20 = 0
            java.lang.String r17 = "run_in_foreground"
            java.lang.String r18 = "INTEGER"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r6 = r16
            java.lang.String r7 = "run_in_foreground"
            r0.put(r7, r6)
            ny6 r13 = new ny6
            r18 = 0
            r16 = 1
            r17 = 0
            java.lang.String r14 = "out_of_quota_policy"
            java.lang.String r15 = "INTEGER"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r6 = "out_of_quota_policy"
            r0.put(r6, r13)
            ny6 r14 = new ny6
            java.lang.String r19 = "0"
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "period_count"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r6 = "period_count"
            r0.put(r6, r14)
            ny6 r15 = new ny6
            java.lang.String r20 = "0"
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "generation"
            java.lang.String r17 = "INTEGER"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r6 = "generation"
            r0.put(r6, r15)
            ny6 r16 = new ny6
            java.lang.String r21 = "9223372036854775807"
            r19 = 1
            r20 = 0
            java.lang.String r17 = "next_schedule_time_override"
            java.lang.String r18 = "INTEGER"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7 = r16
            java.lang.String r9 = "next_schedule_time_override"
            r0.put(r9, r7)
            ny6 r13 = new ny6
            java.lang.String r18 = "0"
            r16 = 1
            r17 = 0
            java.lang.String r14 = "next_schedule_time_override_generation"
            java.lang.String r15 = "INTEGER"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r7 = "next_schedule_time_override_generation"
            r0.put(r7, r13)
            ny6 r14 = new ny6
            java.lang.String r19 = "-256"
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "stop_reason"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r7 = "stop_reason"
            r0.put(r7, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r19 = 0
            java.lang.String r16 = "trace_tag"
            java.lang.String r17 = "TEXT"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r7 = "trace_tag"
            r0.put(r7, r15)
            ny6 r16 = new ny6
            r21 = 0
            r20 = 0
            java.lang.String r17 = "backoff_on_system_interruptions"
            java.lang.String r18 = "INTEGER"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7 = r16
            java.lang.String r9 = "backoff_on_system_interruptions"
            r0.put(r9, r7)
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            r16 = 1
            r17 = 0
            java.lang.String r14 = "required_network_type"
            java.lang.String r15 = "INTEGER"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r7 = "required_network_type"
            r0.put(r7, r13)
            ny6 r14 = new ny6
            java.lang.String r19 = "x''"
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "required_network_request"
            java.lang.String r16 = "BLOB"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r7 = "required_network_request"
            r0.put(r7, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "requires_charging"
            java.lang.String r17 = "INTEGER"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r7 = "requires_charging"
            r0.put(r7, r15)
            ny6 r16 = new ny6
            r21 = 0
            r19 = 1
            r20 = 0
            java.lang.String r17 = "requires_device_idle"
            java.lang.String r18 = "INTEGER"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7 = r16
            java.lang.String r9 = "requires_device_idle"
            r0.put(r9, r7)
            ny6 r13 = new ny6
            r18 = 0
            r16 = 1
            r17 = 0
            java.lang.String r14 = "requires_battery_not_low"
            java.lang.String r15 = "INTEGER"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r7 = "requires_battery_not_low"
            r0.put(r7, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            r17 = 1
            r18 = 0
            java.lang.String r15 = "requires_storage_not_low"
            java.lang.String r16 = "INTEGER"
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r7 = "requires_storage_not_low"
            r0.put(r7, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            r18 = 1
            r19 = 0
            java.lang.String r16 = "trigger_content_update_delay"
            java.lang.String r17 = "INTEGER"
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r7 = "trigger_content_update_delay"
            r0.put(r7, r15)
            ny6 r16 = new ny6
            r21 = 0
            r19 = 1
            r20 = 0
            java.lang.String r17 = "trigger_max_content_delay"
            java.lang.String r18 = "INTEGER"
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7 = r16
            java.lang.String r9 = "trigger_max_content_delay"
            r0.put(r9, r7)
            ny6 r13 = new ny6
            r18 = 0
            r16 = 1
            r17 = 0
            java.lang.String r14 = "content_uri_triggers"
            java.lang.String r15 = "BLOB"
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r7 = "content_uri_triggers"
            r0.put(r7, r13)
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            py6 r10 = new py6
            java.util.List r4 = defpackage.hf.b0(r4)
            java.util.List r13 = defpackage.hf.b0(r8)
            java.lang.String r14 = "index_WorkSpec_schedule_requested_at"
            r10.<init>(r14, r12, r4, r13)
            r9.add(r10)
            py6 r4 = new py6
            java.util.List r2 = defpackage.hf.b0(r2)
            java.util.List r10 = defpackage.hf.b0(r8)
            java.lang.String r13 = "index_WorkSpec_last_enqueue_time"
            r4.<init>(r13, r12, r2, r10)
            r9.add(r4)
            qy6 r2 = new qy6
            java.lang.String r4 = "WorkSpec"
            r2.<init>(r4, r0, r7, r9)
            qy6 r0 = defpackage.kn2.X(r1, r4)
            boolean r4 = r2.equals(r0)
            if (r4 != 0) goto L3e3
            g60 r1 = new g60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n"
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0, r12)
            goto L66b
        L3e3:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "tag"
            java.lang.String r15 = "TEXT"
            r16 = 1
            r17 = 1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "tag"
            r0.put(r2, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "work_spec_id"
            java.lang.String r16 = "TEXT"
            r18 = 2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0.put(r3, r14)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            oy6 r13 = new oy6
            java.util.List r17 = defpackage.hf.b0(r3)
            java.util.List r18 = defpackage.hf.b0(r11)
            java.lang.String r14 = "WorkSpec"
            java.lang.String r15 = "CASCADE"
            java.lang.String r16 = "CASCADE"
            r13.<init>(r14, r15, r16, r17, r18)
            r2.add(r13)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            py6 r7 = new py6
            java.util.List r9 = defpackage.hf.b0(r3)
            java.util.List r10 = defpackage.hf.b0(r8)
            java.lang.String r13 = "index_WorkTag_work_spec_id"
            r7.<init>(r13, r12, r9, r10)
            r4.add(r7)
            qy6 r7 = new qy6
            java.lang.String r9 = "WorkTag"
            r7.<init>(r9, r0, r2, r4)
            qy6 r0 = defpackage.kn2.X(r1, r9)
            boolean r2 = r7.equals(r0)
            if (r2 != 0) goto L46e
            g60 r1 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r7)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L66b
        L46e:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "work_spec_id"
            java.lang.String r15 = "TEXT"
            r16 = 1
            r17 = 1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.put(r3, r13)
            ny6 r14 = new ny6
            java.lang.String r19 = "0"
            r20 = 1
            java.lang.String r15 = "generation"
            java.lang.String r16 = "INTEGER"
            r18 = 2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0.put(r6, r14)
            ny6 r15 = new ny6
            r20 = 0
            r21 = 1
            java.lang.String r16 = "system_id"
            java.lang.String r17 = "INTEGER"
            r18 = 1
            r19 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r2 = "system_id"
            r0.put(r2, r15)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            oy6 r13 = new oy6
            java.util.List r17 = defpackage.hf.b0(r3)
            java.util.List r18 = defpackage.hf.b0(r11)
            java.lang.String r14 = "WorkSpec"
            java.lang.String r15 = "CASCADE"
            java.lang.String r16 = "CASCADE"
            r13.<init>(r14, r15, r16, r17, r18)
            r2.add(r13)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            qy6 r6 = new qy6
            java.lang.String r7 = "SystemIdInfo"
            r6.<init>(r7, r0, r2, r4)
            qy6 r0 = defpackage.kn2.X(r1, r7)
            boolean r2 = r6.equals(r0)
            if (r2 != 0) goto L4fb
            g60 r1 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r6)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L66b
        L4fb:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "name"
            java.lang.String r15 = "TEXT"
            r16 = 1
            r17 = 1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "name"
            r0.put(r2, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "work_spec_id"
            java.lang.String r16 = "TEXT"
            r18 = 2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0.put(r3, r14)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            oy6 r13 = new oy6
            java.util.List r17 = defpackage.hf.b0(r3)
            java.util.List r18 = defpackage.hf.b0(r11)
            java.lang.String r14 = "WorkSpec"
            java.lang.String r15 = "CASCADE"
            java.lang.String r16 = "CASCADE"
            r13.<init>(r14, r15, r16, r17, r18)
            r2.add(r13)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            py6 r6 = new py6
            java.util.List r7 = defpackage.hf.b0(r3)
            java.util.List r8 = defpackage.hf.b0(r8)
            java.lang.String r9 = "index_WorkName_work_spec_id"
            r6.<init>(r9, r12, r7, r8)
            r4.add(r6)
            qy6 r6 = new qy6
            java.lang.String r7 = "WorkName"
            r6.<init>(r7, r0, r2, r4)
            qy6 r0 = defpackage.kn2.X(r1, r7)
            boolean r2 = r6.equals(r0)
            if (r2 != 0) goto L586
            g60 r1 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r6)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L66b
        L586:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "work_spec_id"
            java.lang.String r15 = "TEXT"
            r16 = 1
            r17 = 1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.put(r3, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "progress"
            java.lang.String r16 = "BLOB"
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r2 = "progress"
            r0.put(r2, r14)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            oy6 r13 = new oy6
            java.util.List r17 = defpackage.hf.b0(r3)
            java.util.List r18 = defpackage.hf.b0(r11)
            java.lang.String r14 = "WorkSpec"
            java.lang.String r15 = "CASCADE"
            java.lang.String r16 = "CASCADE"
            r13.<init>(r14, r15, r16, r17, r18)
            r2.add(r13)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            qy6 r4 = new qy6
            java.lang.String r6 = "WorkProgress"
            r4.<init>(r6, r0, r2, r3)
            qy6 r0 = defpackage.kn2.X(r1, r6)
            boolean r2 = r4.equals(r0)
            if (r2 != 0) goto L5fe
            g60 r1 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L66b
        L5fe:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            ny6 r13 = new ny6
            r18 = 0
            r19 = 1
            java.lang.String r14 = "key"
            java.lang.String r15 = "TEXT"
            r16 = 1
            r17 = 1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "key"
            r0.put(r2, r13)
            ny6 r14 = new ny6
            r19 = 0
            r20 = 1
            java.lang.String r15 = "long_value"
            java.lang.String r16 = "INTEGER"
            r17 = 0
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r2 = "long_value"
            r0.put(r2, r14)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            qy6 r4 = new qy6
            java.lang.String r6 = "Preference"
            r4.<init>(r6, r0, r2, r3)
            qy6 r0 = defpackage.kn2.X(r1, r6)
            boolean r1 = r4.equals(r0)
            if (r1 != 0) goto L664
            g60 r1 = new g60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Preference(androidx.work.impl.model.Preference).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            goto L66b
        L664:
            g60 r1 = new g60
            r0 = 1
            r2 = 0
            r1.<init>(r2, r0)
        L66b:
            return r1
        L66c:
            g60 r0 = r23.w(r24)
            return r0
    }
}
