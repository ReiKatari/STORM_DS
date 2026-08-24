package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd6  reason: default package */
/* loaded from: classes.dex */
public final class jd6 implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    public static final java.util.Set f = null;
    public static final java.util.List g = null;
    public static final java.util.List h = null;
    public static final java.util.Set i = null;
    public final android.content.Context a;
    public final android.content.SharedPreferences b;
    public final me.magnum.melonds.database.MelonDatabase c;
    public final defpackage.o41 d;
    public final java.util.concurrent.atomic.AtomicBoolean e;

    static {
            java.lang.String r0 = "dsi_bios_dir"
            java.lang.String r1 = "settings_mirror_fallback_uri"
            java.lang.String r2 = "ra_token"
            java.lang.String r3 = "rom_search_dirs"
            java.lang.String r4 = "bios_dir"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.Set r0 = defpackage.fv.V0(r0)
            defpackage.jd6.f = r0
            java.lang.String r0 = "id"
            java.lang.String r1 = "name"
            java.lang.String[] r2 = new java.lang.String[]{r0, r1}
            java.util.List r2 = defpackage.hf.c0(r2)
            vr4 r3 = new vr4
            java.lang.String r4 = "cheat_database"
            r3.<init>(r4, r2)
            java.lang.String r2 = "game_code"
            java.lang.String r5 = "game_checksum"
            java.lang.String[] r2 = new java.lang.String[]{r0, r1, r2, r5}
            java.util.List r2 = defpackage.hf.c0(r2)
            vr4 r5 = new vr4
            java.lang.String r6 = "game"
            r5.<init>(r6, r2)
            java.lang.String r2 = "game_id"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            vr4 r1 = new vr4
            java.lang.String r2 = "cheat_folder"
            r1.<init>(r2, r0)
            java.lang.String r12 = "code"
            java.lang.String r13 = "enabled"
            java.lang.String r7 = "id"
            java.lang.String r8 = "cheat_folder_id"
            java.lang.String r9 = "cheat_database_id"
            java.lang.String r10 = "name"
            java.lang.String r11 = "description"
            java.lang.String[] r0 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13}
            java.util.List r0 = defpackage.hf.c0(r0)
            vr4 r7 = new vr4
            java.lang.String r8 = "cheat"
            r7.<init>(r8, r0)
            vr4[] r0 = new defpackage.vr4[]{r3, r5, r1, r7}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.jd6.g = r0
            java.lang.String[] r0 = new java.lang.String[]{r8, r2, r6, r4}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.jd6.h = r0
            java.lang.String r0 = "github_updates_last_check"
            java.lang.String r1 = "last_version"
            java.lang.String r2 = "ra_hash_library_last_updated"
            java.lang.String r3 = "github_updates_nightly_next_check_date"
            java.lang.String r4 = "github_updates_nightly_last_release_date"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.Set r0 = defpackage.fv.V0(r0)
            defpackage.jd6.i = r0
            return
    }

    public jd6(android.content.Context r1, android.content.SharedPreferences r2, me.magnum.melonds.database.MelonDatabase r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            gu6 r1 = defpackage.oi2.c()
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            l61 r1 = defpackage.jw2.y(r1, r3)
            o41 r1 = defpackage.g04.i(r1)
            r0.d = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r1.<init>(r3)
            r0.e = r1
            r2.registerOnSharedPreferenceChangeListener(r0)
            return
    }

    public static final void a(defpackage.jd6 r9) {
            org.json.JSONObject r0 = r9.d()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r9.a
            java.io.File r3 = r2.getFilesDir()
            java.lang.String r4 = "melonDualDS.opts"
            r1.<init>(r3, r4)
            q(r1, r0)
            android.net.Uri r1 = r9.e()
            if (r1 == 0) goto L24
            r9.p(r1, r0)
        L24:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            android.content.SharedPreferences r9 = r9.b
            java.lang.String r3 = "sram_dir"
            r5 = 0
            java.util.Set r3 = r9.getStringSet(r3, r5)
            if (r3 == 0) goto L51
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L3a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r0.add(r6)
            goto L3a
        L51:
            java.lang.String r3 = "rom_search_dirs"
            java.util.Set r3 = r9.getStringSet(r3, r5)
            if (r3 == 0) goto L76
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L5f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r0.add(r6)
            goto L5f
        L76:
            java.lang.String r3 = "settings_mirror_fallback_uri"
            java.lang.String r9 = r9.getString(r3, r5)
            if (r9 == 0) goto L85
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r0.add(r9)
        L85:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L8e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r0.next()
            r6 = r3
            android.net.Uri r6 = (android.net.Uri) r6
            boolean r6 = defpackage.nb3.k(r6, r1)
            if (r6 != 0) goto L8e
            r9.add(r3)
            goto L8e
        La5:
            int r0 = r9.size()
            r1 = 0
        Laa:
            if (r1 >= r0) goto Leb
            java.lang.Object r3 = r9.get(r1)
            int r1 = r1 + 1
            android.net.Uri r3 = (android.net.Uri) r3
            qi6 r6 = defpackage.zl1.h(r2, r3)     // Catch: java.lang.Throwable -> Lc7
            zl1 r6 = r6.f(r4)     // Catch: java.lang.Throwable -> Lc7
            if (r6 == 0) goto Lc9
            boolean r6 = r6.d()     // Catch: java.lang.Throwable -> Lc7
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> Lc7
            goto Ld1
        Lc7:
            r6 = move-exception
            goto Lcb
        Lc9:
            r6 = r5
            goto Ld1
        Lcb:
            em5 r7 = new em5
            r7.<init>(r6)
            r6 = r7
        Ld1:
            java.lang.Throwable r6 = defpackage.hm5.a(r6)
            if (r6 == 0) goto Laa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to delete stale settings mirror from "
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r7 = "SettingsBackupManager"
            android.util.Log.w(r7, r3, r6)
            goto Laa
        Leb:
            return
    }

    public static void o(java.io.File r4, byte[] r5) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getParentFile()
            java.lang.String r2 = r4.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ".tmp"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r1.write(r5)     // Catch: java.lang.Throwable -> L6b
            r1.flush()     // Catch: java.lang.Throwable -> L6b
            java.io.FileDescriptor r5 = r1.getFD()     // Catch: java.lang.Throwable -> L30
            r5.sync()     // Catch: java.lang.Throwable -> L30
        L30:
            r1.close()
            boolean r5 = r0.renameTo(r4)
            if (r5 != 0) goto L6a
            boolean r5 = r4.exists()
            if (r5 == 0) goto L54
            boolean r5 = r4.delete()
            if (r5 == 0) goto L46
            goto L54
        L46:
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r5 = "Could not replace "
            java.lang.String r4 = defpackage.i61.m(r5, r4)
            defpackage.i.m(r4)
            return
        L54:
            boolean r5 = r0.renameTo(r4)
            if (r5 == 0) goto L5b
            goto L6a
        L5b:
            java.lang.String r5 = r0.getAbsolutePath()
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r0 = "Could not move "
            java.lang.String r1 = " to "
            defpackage.e41.r(r0, r5, r1, r4)
        L6a:
            return
        L6b:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L6d
        L6d:
            r5 = move-exception
            defpackage.ge7.t(r1, r4)
            throw r5
    }

    public static void q(java.io.File r1, java.lang.String r2) {
            java.nio.charset.Charset r0 = defpackage.qm0.a
            byte[] r2 = r2.getBytes(r0)
            r2.getClass()
            o(r1, r2)
            return
    }

    public final void b(android.net.Uri r4) {
            r3 = this;
            r4.getClass()
            android.content.Context r0 = r3.a
            qi6 r4 = defpackage.zl1.h(r0, r4)
            java.lang.String r1 = "melonDualDS.opts"
            zl1 r2 = r4.f(r1)
            if (r2 != 0) goto L1a
            java.lang.String r2 = "application/octet-stream"
            zl1 r2 = r4.c(r2, r1)
            if (r2 != 0) goto L1a
            goto L50
        L1a:
            android.content.ContentResolver r4 = r0.getContentResolver()
            android.net.Uri r0 = r2.j()
            java.io.OutputStream r4 = r4.openOutputStream(r0)
            if (r4 == 0) goto L50
            java.nio.charset.Charset r0 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L41
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L41
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L41
            org.json.JSONObject r3 = r3.d()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L43
            r1.write(r3)     // Catch: java.lang.Throwable -> L43
            r1.close()     // Catch: java.lang.Throwable -> L41
            r4.close()
            return
        L41:
            r3 = move-exception
            goto L4a
        L43:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            defpackage.ge7.t(r1, r3)     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L4a:
            throw r3     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            defpackage.ge7.t(r4, r3)
            throw r0
        L50:
            return
    }

    public final void c(android.net.Uri r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r3 = r3.a
            qi6 r4 = defpackage.zl1.h(r3, r4)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.getFilesDir()
            java.lang.String r2 = "layouts.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L19
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L33
            java.lang.String r0 = defpackage.jc2.B0(r0)     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L28:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto L2e
            r0 = r2
        L2e:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L33
            goto L35
        L33:
            java.lang.String r0 = "[]"
        L35:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            goto L41
        L3b:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
        L41:
            boolean r0 = r1 instanceof defpackage.em5
            if (r0 == 0) goto L46
            goto L47
        L46:
            r2 = r1
        L47:
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            if (r2 != 0) goto L4c
            goto L8d
        L4c:
            zl1 r0 = r4.f(r5)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "application/json"
            zl1 r0 = r4.c(r0, r5)
            if (r0 != 0) goto L5b
            goto L8d
        L5b:
            android.content.ContentResolver r3 = r3.getContentResolver()
            android.net.Uri r4 = r0.j()
            java.io.OutputStream r3 = r3.openOutputStream(r4)
            if (r3 == 0) goto L8d
            java.nio.charset.Charset r4 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L7e
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L80
            r5.write(r4)     // Catch: java.lang.Throwable -> L80
            r5.close()     // Catch: java.lang.Throwable -> L7e
            r3.close()
            goto L8d
        L7e:
            r4 = move-exception
            goto L87
        L80:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            defpackage.ge7.t(r5, r4)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L7e
        L87:
            throw r4     // Catch: java.lang.Throwable -> L88
        L88:
            r5 = move-exception
            defpackage.ge7.t(r3, r4)
            throw r5
        L8d:
            return
    }

    public final org.json.JSONObject d() {
            r14 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "version"
            r2 = 1
            r0.put(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            android.content.SharedPreferences r3 = r14.b
            java.util.Map r3 = r3.getAll()
            r3.getClass()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L21:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.util.Set r6 = defpackage.jd6.f
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L21
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 != 0) goto L75
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 != 0) goto L75
            boolean r6 = r4 instanceof java.lang.Long
            if (r6 != 0) goto L75
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 != 0) goto L75
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L54
            goto L75
        L54:
            boolean r6 = r4 instanceof java.util.Set
            if (r6 == 0) goto L21
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L63:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L71
            java.lang.Object r7 = r4.next()
            r6.put(r7)
            goto L63
        L71:
            r1.put(r5, r6)
            goto L21
        L75:
            r1.put(r5, r4)
            goto L21
        L79:
            java.lang.String r3 = "settings"
            r0.put(r3, r1)
            java.lang.String r1 = "controller_config.json"
            java.lang.Object r1 = r14.g(r1)
            if (r1 == 0) goto L8b
            java.lang.String r3 = "controllerConfig"
            r0.put(r3, r1)
        L8b:
            java.lang.String r1 = "layouts.json"
            java.lang.Object r1 = r14.g(r1)
            if (r1 == 0) goto L98
            java.lang.String r3 = "layouts"
            r0.put(r3, r1)
        L98:
            java.lang.String r1 = "backgrounds.json"
            java.lang.Object r1 = r14.g(r1)
            if (r1 == 0) goto La5
            java.lang.String r3 = "backgrounds"
            r0.put(r3, r1)
        La5:
            java.lang.String r1 = "rom_data.json"
            java.lang.Object r1 = r14.g(r1)
            boolean r3 = r1 instanceof org.json.JSONArray
            r4 = 0
            if (r3 == 0) goto Lb3
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            goto Lb4
        Lb3:
            r1 = r4
        Lb4:
            if (r1 != 0) goto Lb7
            goto Le3
        Lb7:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            int r3 = r1.length()
            r5 = 0
        Lc1:
            if (r5 >= r3) goto Le3
            org.json.JSONObject r6 = r1.optJSONObject(r5)
            if (r6 != 0) goto Lca
            goto Le0
        Lca:
            org.json.JSONObject r7 = new org.json.JSONObject
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            java.lang.String r6 = "uri"
            r7.remove(r6)
            java.lang.String r6 = "parentTreeUri"
            r7.remove(r6)
            r4.put(r7)
        Le0:
            int r5 = r5 + 1
            goto Lc1
        Le3:
            if (r4 == 0) goto Lea
            java.lang.String r1 = "roms"
            r0.put(r1, r4)
        Lea:
            me.magnum.melonds.database.MelonDatabase r14 = r14.c
            pu6 r14 = r14.h()
            vm2 r14 = r14.G()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.List r3 = defpackage.jd6.g
            java.util.Iterator r3 = r3.iterator()
        Lff:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L19c
            java.lang.Object r4 = r3.next()
            vr4 r4 = (defpackage.vr4) r4
            java.lang.Object r5 = r4.A
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.B
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r10 = 0
            r11 = 62
            java.lang.String r7 = ", "
            r8 = 0
            r9 = 0
            java.lang.String r7 = defpackage.gt0.P0(r6, r7, r8, r9, r10, r11)
            java.lang.String r8 = " FROM "
            java.lang.String r9 = " ORDER BY id"
            java.lang.String r10 = "SELECT "
            java.lang.String r7 = defpackage.lb1.n(r10, r7, r8, r5, r9)
            android.database.Cursor r7 = r14.A(r7)
        L132:
            boolean r8 = r7.moveToNext()     // Catch: java.lang.Throwable -> L169
            if (r8 == 0) goto L18e
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L169
            r8.<init>()     // Catch: java.lang.Throwable -> L169
            java.util.Iterator r9 = r6.iterator()     // Catch: java.lang.Throwable -> L169
        L141:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L169
            if (r10 == 0) goto L18a
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L169
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L169
            int r11 = r7.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L169
            int r12 = r7.getType(r11)     // Catch: java.lang.Throwable -> L169
            if (r12 == 0) goto L184
            if (r12 == r2) goto L17c
            r13 = 2
            if (r12 == r13) goto L174
            r13 = 3
            if (r12 == r13) goto L16c
            r11 = 4
            if (r12 == r11) goto L163
            goto L141
        L163:
            java.lang.Object r11 = org.json.JSONObject.NULL     // Catch: java.lang.Throwable -> L169
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L169
            goto L141
        L169:
            r0 = move-exception
            r14 = r0
            goto L196
        L16c:
            java.lang.String r11 = r7.getString(r11)     // Catch: java.lang.Throwable -> L169
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L169
            goto L141
        L174:
            double r11 = r7.getDouble(r11)     // Catch: java.lang.Throwable -> L169
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L169
            goto L141
        L17c:
            long r11 = r7.getLong(r11)     // Catch: java.lang.Throwable -> L169
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L169
            goto L141
        L184:
            java.lang.Object r11 = org.json.JSONObject.NULL     // Catch: java.lang.Throwable -> L169
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L169
            goto L141
        L18a:
            r4.put(r8)     // Catch: java.lang.Throwable -> L169
            goto L132
        L18e:
            r7.close()
            r1.put(r5, r4)
            goto Lff
        L196:
            throw r14     // Catch: java.lang.Throwable -> L197
        L197:
            r0 = move-exception
            defpackage.ge7.t(r7, r14)
            throw r0
        L19c:
            java.lang.String r14 = "cheats"
            r0.put(r14, r1)
            return r0
    }

    public final android.net.Uri e() {
            r2 = this;
            java.lang.String r0 = "use_rom_dir"
            r1 = 1
            android.content.SharedPreferences r2 = r2.b
            boolean r0 = r2.getBoolean(r0, r1)
            r1 = 0
            if (r0 != 0) goto L23
            java.lang.String r0 = "sram_dir"
            java.util.Set r0 = r2.getStringSet(r0, r1)
            if (r0 == 0) goto L23
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.gt0.I0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L23
            android.net.Uri r2 = android.net.Uri.parse(r0)
            return r2
        L23:
            java.lang.String r0 = "settings_mirror_fallback_uri"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 == 0) goto L30
            android.net.Uri r2 = android.net.Uri.parse(r0)
            return r2
        L30:
            java.lang.String r0 = "rom_search_dirs"
            java.util.Set r2 = r2.getStringSet(r0, r1)
            if (r2 == 0) goto L47
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = defpackage.gt0.I0(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L47
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L47:
            return r1
    }

    public final boolean f(android.net.Uri r5) {
            r4 = this;
            r5.getClass()
            android.content.Context r4 = r4.a
            qi6 r0 = defpackage.zl1.h(r4, r5)
            java.lang.String r1 = "melonDualDS.opts"
            zl1 r0 = r0.f(r1)
            r1 = 0
            if (r0 == 0) goto L7e
            boolean r2 = r0.l()
            r3 = 0
            if (r2 == 0) goto L1a
            goto L1b
        L1a:
            r0 = r3
        L1b:
            if (r0 != 0) goto L1e
            goto L7e
        L1e:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L40
            android.net.Uri r0 = r0.j()     // Catch: java.lang.Throwable -> L40
            java.io.InputStream r4 = r4.openInputStream(r0)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L49
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L42
            java.nio.charset.Charset r0 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L42
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L42
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = defpackage.yh2.E(r2)     // Catch: java.lang.Throwable -> L42
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L42
            r4.close()     // Catch: java.lang.Throwable -> L40
            goto L49
        L40:
            r4 = move-exception
            goto L51
        L42:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L44
        L44:
            r1 = move-exception
            defpackage.ge7.t(r4, r0)     // Catch: java.lang.Throwable -> L40
            throw r1     // Catch: java.lang.Throwable -> L40
        L49:
            if (r3 == 0) goto L4c
            r1 = 1
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L40
            goto L57
        L51:
            em5 r0 = new em5
            r0.<init>(r4)
            r4 = r0
        L57:
            java.lang.Throwable r0 = defpackage.hm5.a(r4)
            if (r0 == 0) goto L70
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ignoring invalid settings mirror at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "SettingsBackupManager"
            android.util.Log.w(r1, r5, r0)
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r0 = r4 instanceof defpackage.em5
            if (r0 == 0) goto L77
            r4 = r5
        L77:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L7e:
            return r1
    }

    public final java.lang.Object g(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r3 = r3.a
            java.io.File r3 = r3.getFilesDir()
            r0.<init>(r3, r4)
            boolean r3 = r0.exists()
            r4 = 0
            if (r3 != 0) goto L13
            goto L54
        L13:
            java.lang.String r3 = defpackage.jc2.B0(r0)
            java.lang.CharSequence r0 = defpackage.qs6.T0(r3)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            int r1 = r0.length()
            if (r1 != 0) goto L2a
            r0 = r4
            goto L33
        L2a:
            r1 = 0
            char r0 = r0.charAt(r1)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
        L33:
            if (r0 != 0) goto L36
            goto L44
        L36:
            char r1 = r0.charValue()
            r2 = 91
            if (r1 != r2) goto L44
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r3)
            return r4
        L44:
            if (r0 != 0) goto L47
            goto L54
        L47:
            char r0 = r0.charValue()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L54
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r3)
        L54:
            return r4
    }

    public final void h(android.net.Uri r2) {
            r1 = this;
            r2.getClass()
            android.content.SharedPreferences r1 = r1.b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "settings_mirror_fallback_uri"
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public final void i() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.b
            java.lang.String r1 = "save_internal_config_as_file"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Lc
            goto L15
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.e
            r1 = 1
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 != 0) goto L16
        L15:
            return
        L16:
            y3 r0 = new y3
            r1 = 16
            r2 = 0
            r0.<init>(r3, r2, r1)
            r1 = 3
            o41 r3 = r3.d
            defpackage.hv.L(r3, r2, r2, r0, r1)
            return
    }

    public final void j(android.net.Uri r12) {
            r11 = this;
            android.content.SharedPreferences r0 = r11.b
            r12.getClass()
            android.content.Context r1 = r11.a
            qi6 r12 = defpackage.zl1.h(r1, r12)
            java.lang.String r2 = "melonDualDS.opts"
            zl1 r2 = r12.f(r2)
            if (r2 == 0) goto L3f
            android.content.ContentResolver r12 = r1.getContentResolver()
            android.net.Uri r0 = r2.j()
            java.io.InputStream r12 = r12.openInputStream(r0)
            if (r12 == 0) goto L218
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L38
            java.nio.charset.Charset r1 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L38
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38
            r2.<init>(r12, r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = defpackage.yh2.E(r2)     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            r11.k(r0)     // Catch: java.lang.Throwable -> L38
            r12.close()
            return
        L38:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L3a
        L3a:
            r0 = move-exception
            defpackage.ge7.t(r12, r11)
            throw r0
        L3f:
            java.lang.String r11 = "settings.json"
            zl1 r11 = r12.f(r11)
            if (r11 == 0) goto L173
            android.net.Uri r11 = r11.j()
            if (r11 == 0) goto L173
            android.content.ContentResolver r2 = r1.getContentResolver()
            java.io.InputStream r11 = r2.openInputStream(r11)
            if (r11 == 0) goto L173
            java.nio.charset.Charset r2 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L98
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L98
            r3.<init>(r11, r2)     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = defpackage.yh2.E(r3)     // Catch: java.lang.Throwable -> L98
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L98
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L98
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r4 = r3.keys()     // Catch: java.lang.Throwable -> L98
            r4.getClass()     // Catch: java.lang.Throwable -> L98
        L72:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto L166
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L98
            java.util.Set r6 = defpackage.jd6.f     // Catch: java.lang.Throwable -> L98
            boolean r6 = r6.contains(r5)     // Catch: java.lang.Throwable -> L98
            if (r6 != 0) goto L72
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L98
            boolean r7 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L9b
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L98
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L98
            r2.putBoolean(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        L98:
            r12 = move-exception
            goto L16d
        L9b:
            boolean r7 = r6 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L98
            java.util.Set r8 = defpackage.jd6.i
            if (r7 == 0) goto Lbc
            boolean r7 = r8.contains(r5)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto Lb2
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L98
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L98
            r2.putLong(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        Lb2:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L98
            r2.putInt(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        Lbc:
            boolean r7 = r6 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto Lca
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L98
            r2.putLong(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        Lca:
            boolean r7 = r6 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto Ld9
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            double r6 = r6.doubleValue()     // Catch: java.lang.Throwable -> L98
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L98
            r2.putFloat(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        Ld9:
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto Le3
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L98
            r2.putString(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        Le3:
            boolean r7 = r6 instanceof org.json.JSONArray     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L10b
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L98
            r7.<init>()     // Catch: java.lang.Throwable -> L98
            r8 = r6
            org.json.JSONArray r8 = (org.json.JSONArray) r8     // Catch: java.lang.Throwable -> L98
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L98
            r9 = 0
        Lf4:
            if (r9 >= r8) goto L106
            r10 = r6
            org.json.JSONArray r10 = (org.json.JSONArray) r10     // Catch: java.lang.Throwable -> L98
            java.lang.String r10 = r10.getString(r9)     // Catch: java.lang.Throwable -> L98
            r10.getClass()     // Catch: java.lang.Throwable -> L98
            r7.add(r10)     // Catch: java.lang.Throwable -> L98
            int r9 = r9 + 1
            goto Lf4
        L106:
            r2.putStringSet(r5, r7)     // Catch: java.lang.Throwable -> L98
            goto L72
        L10b:
            boolean r7 = r6 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L72
            java.util.Map r7 = r0.getAll()     // Catch: java.lang.Throwable -> L98
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L98
            boolean r9 = r7 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L98
            if (r9 != 0) goto L15b
            boolean r8 = r8.contains(r5)     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L122
            goto L15b
        L122:
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L131
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L98
            r2.putInt(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        L131:
            boolean r7 = r7 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L140
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            float r6 = r6.floatValue()     // Catch: java.lang.Throwable -> L98
            r2.putFloat(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        L140:
            boolean r7 = r6 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L150
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            double r6 = r6.doubleValue()     // Catch: java.lang.Throwable -> L98
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L98
            r2.putFloat(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        L150:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L98
            r2.putLong(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        L15b:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L98
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L98
            r2.putLong(r5, r6)     // Catch: java.lang.Throwable -> L98
            goto L72
        L166:
            r2.apply()     // Catch: java.lang.Throwable -> L98
            r11.close()
            goto L173
        L16d:
            throw r12     // Catch: java.lang.Throwable -> L16e
        L16e:
            r0 = move-exception
            defpackage.ge7.t(r11, r12)
            throw r0
        L173:
            java.lang.String r11 = "controller_config.json"
            zl1 r0 = r12.f(r11)
            if (r0 == 0) goto L1a6
            android.net.Uri r0 = r0.j()
            if (r0 == 0) goto L1a6
            java.io.File r2 = new java.io.File
            java.io.File r3 = r1.getFilesDir()
            r2.<init>(r3, r11)
            android.content.ContentResolver r11 = r1.getContentResolver()
            java.io.InputStream r11 = r11.openInputStream(r0)
            if (r11 == 0) goto L1a6
            byte[] r0 = defpackage.f04.M(r11)     // Catch: java.lang.Throwable -> L19f
            o(r2, r0)     // Catch: java.lang.Throwable -> L19f
            r11.close()
            goto L1a6
        L19f:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> L1a1
        L1a1:
            r0 = move-exception
            defpackage.ge7.t(r11, r12)
            throw r0
        L1a6:
            java.lang.String r11 = "layouts.json"
            zl1 r0 = r12.f(r11)
            if (r0 == 0) goto L1d9
            android.net.Uri r0 = r0.j()
            if (r0 == 0) goto L1d9
            java.io.File r2 = new java.io.File
            java.io.File r3 = r1.getFilesDir()
            r2.<init>(r3, r11)
            android.content.ContentResolver r11 = r1.getContentResolver()
            java.io.InputStream r11 = r11.openInputStream(r0)
            if (r11 == 0) goto L1d9
            byte[] r0 = defpackage.f04.M(r11)     // Catch: java.lang.Throwable -> L1d2
            o(r2, r0)     // Catch: java.lang.Throwable -> L1d2
            r11.close()
            goto L1d9
        L1d2:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> L1d4
        L1d4:
            r0 = move-exception
            defpackage.ge7.t(r11, r12)
            throw r0
        L1d9:
            java.lang.String r11 = "rom_data.json"
            zl1 r12 = r12.f(r11)
            if (r12 == 0) goto L218
            android.net.Uri r12 = r12.j()
            if (r12 == 0) goto L218
            android.content.ContentResolver r0 = r1.getContentResolver()
            java.io.InputStream r12 = r0.openInputStream(r12)
            if (r12 == 0) goto L218
            java.nio.charset.Charset r0 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L211
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L211
            r2.<init>(r12, r0)     // Catch: java.lang.Throwable -> L211
            java.lang.String r0 = defpackage.yh2.E(r2)     // Catch: java.lang.Throwable -> L211
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L211
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L211
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L211
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L211
            r2.<init>(r1, r11)     // Catch: java.lang.Throwable -> L211
            q(r2, r0)     // Catch: java.lang.Throwable -> L211
            r12.close()
            return
        L211:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L213
        L213:
            r0 = move-exception
            defpackage.ge7.t(r12, r11)
            throw r0
        L218:
            return
    }

    public final void k(org.json.JSONObject r15) {
            r14 = this;
            java.lang.String r0 = "settings"
            org.json.JSONObject r0 = r15.optJSONObject(r0)
            r1 = 0
            if (r0 == 0) goto L106
            android.content.SharedPreferences r2 = r14.b
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.util.Iterator r4 = r0.keys()
            r4.getClass()
        L16:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L103
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r6 = defpackage.jd6.f
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L16
            java.lang.Object r6 = r0.get(r5)
            boolean r7 = r6 instanceof java.lang.Boolean
            if (r7 == 0) goto L3c
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r3.putBoolean(r5, r6)
            goto L16
        L3c:
            boolean r7 = r6 instanceof java.lang.Integer
            java.util.Set r8 = defpackage.jd6.i
            if (r7 == 0) goto L5d
            boolean r7 = r8.contains(r5)
            if (r7 == 0) goto L53
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            long r6 = (long) r6
            r3.putLong(r5, r6)
            goto L16
        L53:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r3.putInt(r5, r6)
            goto L16
        L5d:
            boolean r7 = r6 instanceof java.lang.Long
            if (r7 == 0) goto L6b
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            r3.putLong(r5, r6)
            goto L16
        L6b:
            boolean r7 = r6 instanceof java.lang.Double
            if (r7 == 0) goto L7a
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            float r6 = (float) r6
            r3.putFloat(r5, r6)
            goto L16
        L7a:
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L84
            java.lang.String r6 = (java.lang.String) r6
            r3.putString(r5, r6)
            goto L16
        L84:
            boolean r7 = r6 instanceof org.json.JSONArray
            if (r7 == 0) goto La8
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r8 = r6.length()
            r9 = r1
        L94:
            if (r9 >= r8) goto La3
            java.lang.String r10 = r6.getString(r9)
            r10.getClass()
            r7.add(r10)
            int r9 = r9 + 1
            goto L94
        La3:
            r3.putStringSet(r5, r7)
            goto L16
        La8:
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto L16
            java.util.Map r7 = r2.getAll()
            java.lang.Object r7 = r7.get(r5)
            boolean r9 = r7 instanceof java.lang.Long
            if (r9 != 0) goto Lf8
            boolean r8 = r8.contains(r5)
            if (r8 == 0) goto Lbf
            goto Lf8
        Lbf:
            boolean r8 = r7 instanceof java.lang.Integer
            if (r8 == 0) goto Lce
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r3.putInt(r5, r6)
            goto L16
        Lce:
            boolean r7 = r7 instanceof java.lang.Float
            if (r7 == 0) goto Ldd
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r3.putFloat(r5, r6)
            goto L16
        Ldd:
            boolean r7 = r6 instanceof java.lang.Double
            if (r7 == 0) goto Led
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            float r6 = (float) r6
            r3.putFloat(r5, r6)
            goto L16
        Led:
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            r3.putLong(r5, r6)
            goto L16
        Lf8:
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            r3.putLong(r5, r6)
            goto L16
        L103:
            r3.apply()
        L106:
            java.lang.String r0 = "controllerConfig"
            java.lang.String r2 = "controller_config.json"
            r14.l(r15, r0, r2)
            java.lang.String r0 = "layouts"
            java.lang.String r2 = "layouts.json"
            r14.l(r15, r0, r2)
            java.lang.String r0 = "backgrounds"
            java.lang.String r2 = "backgrounds.json"
            r14.l(r15, r0, r2)
            java.lang.String r0 = "roms"
            org.json.JSONArray r0 = r15.optJSONArray(r0)
            if (r0 != 0) goto L124
            goto L16a
        L124:
            int r2 = r0.length()
            r3 = r1
        L129:
            android.content.Context r4 = r14.a
            if (r3 >= r2) goto L155
            org.json.JSONObject r5 = r0.optJSONObject(r3)
            if (r5 != 0) goto L134
            goto L16a
        L134:
            java.lang.String r6 = "uri"
            boolean r5 = r5.has(r6)
            if (r5 != 0) goto L152
            java.io.File r2 = new java.io.File
            java.io.File r3 = r4.getFilesDir()
            java.lang.String r4 = "rom_metadata_mirror.json"
            r2.<init>(r3, r4)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            q(r2, r0)
            goto L16a
        L152:
            int r3 = r3 + 1
            goto L129
        L155:
            java.io.File r2 = new java.io.File
            java.io.File r3 = r4.getFilesDir()
            java.lang.String r4 = "rom_data.json"
            r2.<init>(r3, r4)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            q(r2, r0)
        L16a:
            java.lang.String r0 = "cheats"
            org.json.JSONObject r15 = r15.optJSONObject(r0)
            if (r15 == 0) goto L278
            me.magnum.melonds.database.MelonDatabase r0 = r14.c
            pu6 r0 = r0.h()
            vm2 r0 = r0.I()
            r0.e()
            java.util.List r2 = defpackage.jd6.h     // Catch: java.lang.Throwable -> L1b1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1b1
        L185:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1b1
            if (r3 == 0) goto L1b4
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1b1
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1b1
            r3.getClass()     // Catch: java.lang.Throwable -> L1b1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r6 = "DELETE FROM "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L1b1
            r5.append(r3)     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L1b1
            dn2 r3 = r0.k(r3)     // Catch: java.lang.Throwable -> L1b1
            defpackage.np2.p(r3, r4)     // Catch: java.lang.Throwable -> L1b1
            android.database.sqlite.SQLiteStatement r3 = r3.B     // Catch: java.lang.Throwable -> L1b1
            r3.executeUpdateDelete()     // Catch: java.lang.Throwable -> L1b1
            goto L185
        L1b1:
            r14 = move-exception
            goto L274
        L1b4:
            java.util.List r2 = defpackage.jd6.g     // Catch: java.lang.Throwable -> L1b1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1b1
        L1ba:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1b1
            if (r3 == 0) goto L26a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1b1
            vr4 r3 = (defpackage.vr4) r3     // Catch: java.lang.Throwable -> L1b1
            java.lang.Object r4 = r3.A     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1b1
            java.lang.Object r3 = r3.B     // Catch: java.lang.Throwable -> L1b1
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L1b1
            org.json.JSONArray r5 = r15.optJSONArray(r4)     // Catch: java.lang.Throwable -> L1b1
            if (r5 != 0) goto L1d5
            goto L1ba
        L1d5:
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L1b1
            r7 = r1
        L1da:
            if (r7 >= r6) goto L1ba
            org.json.JSONObject r8 = r5.optJSONObject(r7)     // Catch: java.lang.Throwable -> L1b1
            if (r8 != 0) goto L1e4
            goto L266
        L1e4:
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L1b1
            r9.<init>()     // Catch: java.lang.Throwable -> L1b1
            java.util.Iterator r10 = r3.iterator()     // Catch: java.lang.Throwable -> L1b1
        L1ed:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L1b1
            if (r11 == 0) goto L262
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L1b1
            boolean r12 = r8.has(r11)     // Catch: java.lang.Throwable -> L1b1
            if (r12 == 0) goto L25e
            boolean r12 = r8.isNull(r11)     // Catch: java.lang.Throwable -> L1b1
            if (r12 == 0) goto L206
            goto L25e
        L206:
            java.lang.Object r12 = r8.get(r11)     // Catch: java.lang.Throwable -> L1b1
            boolean r13 = r12 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L1b1
            if (r13 == 0) goto L21c
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L1b1
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L1b1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L1b1
            r9.put(r11, r12)     // Catch: java.lang.Throwable -> L1b1
            goto L1ed
        L21c:
            boolean r13 = r12 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1b1
            if (r13 == 0) goto L226
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L1b1
            r9.put(r11, r12)     // Catch: java.lang.Throwable -> L1b1
            goto L1ed
        L226:
            boolean r13 = r12 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L1b1
            if (r13 == 0) goto L230
            java.lang.Long r12 = (java.lang.Long) r12     // Catch: java.lang.Throwable -> L1b1
            r9.put(r11, r12)     // Catch: java.lang.Throwable -> L1b1
            goto L1ed
        L230:
            boolean r13 = r12 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L1b1
            if (r13 == 0) goto L23a
            java.lang.Double r12 = (java.lang.Double) r12     // Catch: java.lang.Throwable -> L1b1
            r9.put(r11, r12)     // Catch: java.lang.Throwable -> L1b1
            goto L1ed
        L23a:
            boolean r13 = r12 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1b1
            if (r13 == 0) goto L244
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L1b1
            r9.put(r11, r12)     // Catch: java.lang.Throwable -> L1b1
            goto L1ed
        L244:
            boolean r13 = r12 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L1b1
            if (r13 == 0) goto L256
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Throwable -> L1b1
            long r12 = r12.longValue()     // Catch: java.lang.Throwable -> L1b1
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L1b1
            r9.put(r11, r12)     // Catch: java.lang.Throwable -> L1b1
            goto L1ed
        L256:
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L1b1
            r9.put(r11, r12)     // Catch: java.lang.Throwable -> L1b1
            goto L1ed
        L25e:
            r9.putNull(r11)     // Catch: java.lang.Throwable -> L1b1
            goto L1ed
        L262:
            r8 = 5
            r0.v(r4, r8, r9)     // Catch: java.lang.Throwable -> L1b1
        L266:
            int r7 = r7 + 1
            goto L1da
        L26a:
            r0.D()     // Catch: java.lang.Throwable -> L1b1
            r0.n()
            r14.i()
            goto L278
        L274:
            r0.n()
            throw r14
        L278:
            r14.i()
            return
    }

    public final void l(org.json.JSONObject r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.Object r2 = r2.opt(r3)
            if (r2 != 0) goto L7
            return
        L7:
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 != 0) goto L1b
            boolean r0 = r2 instanceof org.json.JSONArray
            if (r0 != 0) goto L1b
            java.lang.String r1 = "Skipping invalid backup value for "
            java.lang.String r1 = r1.concat(r3)
            java.lang.String r2 = "SettingsBackupManager"
            android.util.Log.w(r2, r1)
            return
        L1b:
            java.io.File r3 = new java.io.File
            android.content.Context r1 = r1.a
            java.io.File r1 = r1.getFilesDir()
            r3.<init>(r1, r4)
            java.lang.String r1 = r2.toString()
            q(r3, r1)
            return
    }

    public final void m(android.net.Uri r5) {
            r4 = this;
            android.content.Context r0 = r4.a
            r5.getClass()
            qi6 r1 = defpackage.zl1.h(r0, r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "melonDualDS.opts"
            zl1 r1 = r1.f(r2)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L12
            goto L63
        L12:
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L39
            android.net.Uri r1 = r1.j()     // Catch: java.lang.Throwable -> L39
            java.io.InputStream r0 = r0.openInputStream(r1)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L42
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3b
            java.nio.charset.Charset r2 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L3b
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = defpackage.yh2.E(r3)     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            r4.k(r1)     // Catch: java.lang.Throwable -> L3b
            r0.close()     // Catch: java.lang.Throwable -> L39
            jg7 r4 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L39
            goto L4a
        L39:
            r4 = move-exception
            goto L44
        L3b:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L3d
        L3d:
            r1 = move-exception
            defpackage.ge7.t(r0, r4)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        L42:
            r4 = 0
            goto L4a
        L44:
            em5 r0 = new em5
            r0.<init>(r4)
            r4 = r0
        L4a:
            java.lang.Throwable r4 = defpackage.hm5.a(r4)
            if (r4 == 0) goto L63
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to restore settings mirror from "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "SettingsBackupManager"
            android.util.Log.w(r0, r5, r4)
        L63:
            return
    }

    public final void n(android.net.Uri r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r2 = r2.a
            qi6 r3 = defpackage.zl1.h(r2, r3)
            zl1 r3 = r3.f(r4)
            if (r3 != 0) goto Ld
            goto L5e
        Ld:
            android.content.ContentResolver r4 = r2.getContentResolver()
            android.net.Uri r3 = r3.j()
            java.io.InputStream r3 = r4.openInputStream(r3)
            if (r3 == 0) goto L5e
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c
            java.nio.charset.Charset r0 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L2c
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = defpackage.yh2.E(r1)     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r4 = move-exception
            em5 r0 = new em5     // Catch: java.lang.Throwable -> L57
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L57
            r4 = r0
        L33:
            boolean r0 = r4 instanceof defpackage.em5     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L39
            r4 = 0
        L39:
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: java.lang.Throwable -> L57
            r3.close()
            if (r4 != 0) goto L41
            goto L5e
        L41:
            java.io.File r3 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r0 = "layouts.json"
            r3.<init>(r2, r0)
            java.lang.String r2 = r4.toString()
            r2.getClass()
            q(r3, r2)
            return
        L57:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r4 = move-exception
            defpackage.ge7.t(r3, r2)
            throw r4
        L5e:
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            java.lang.String r2 = "save_internal_config_as_file"
            boolean r3 = defpackage.nb3.k(r3, r2)
            if (r3 == 0) goto L15
            android.content.SharedPreferences r3 = r1.b
            r0 = 0
            boolean r2 = r3.getBoolean(r2, r0)
            if (r2 == 0) goto L15
            return
        L15:
            r1.i()
            return
    }

    public final void p(android.net.Uri r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r2 = r2.a
            qi6 r3 = defpackage.zl1.h(r2, r3)
            java.lang.String r0 = "melonDualDS.opts"
            zl1 r1 = r3.f(r0)
            if (r1 != 0) goto L17
            java.lang.String r1 = "application/octet-stream"
            zl1 r1 = r3.c(r1, r0)
            if (r1 != 0) goto L17
            goto L47
        L17:
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r3 = r1.j()
            java.lang.String r0 = "wt"
            java.io.OutputStream r2 = r2.openOutputStream(r3, r0)
            if (r2 == 0) goto L47
            java.nio.charset.Charset r3 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L38
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L38
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L38
            r0.write(r4)     // Catch: java.lang.Throwable -> L3a
            r0.close()     // Catch: java.lang.Throwable -> L38
            r2.close()
            return
        L38:
            r3 = move-exception
            goto L41
        L3a:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = move-exception
            defpackage.ge7.t(r0, r3)     // Catch: java.lang.Throwable -> L38
            throw r4     // Catch: java.lang.Throwable -> L38
        L41:
            throw r3     // Catch: java.lang.Throwable -> L42
        L42:
            r4 = move-exception
            defpackage.ge7.t(r2, r3)
            throw r4
        L47:
            return
    }
}
