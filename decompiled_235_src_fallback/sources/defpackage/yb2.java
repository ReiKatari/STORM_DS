package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb2  reason: default package */
/* loaded from: classes.dex */
public final class yb2 {
    public final android.content.Context a;
    public final defpackage.kd6 b;
    public final defpackage.b46 c;
    public final defpackage.uh7 d;

    public yb2(android.content.Context r1, defpackage.kd6 r2, defpackage.b46 r3, defpackage.uh7 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final java.lang.String a(defpackage.pq5 r1) {
            r0 = this;
            uh7 r0 = r0.d
            android.net.Uri r1 = r1.d
            zl1 r0 = r0.a(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = defpackage.hf.V(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final android.net.Uri b(defpackage.pq5 r2, defpackage.c46 r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            zl1 r0 = r1.e(r2)
            if (r0 == 0) goto L55
            java.lang.String r1 = r1.a(r2)
            if (r1 == 0) goto L4d
            int r2 = r3.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = ".ml"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            zl1 r2 = r0.f(r1)
            if (r2 == 0) goto L33
            android.net.Uri r1 = r2.j()
            goto L41
        L33:
            java.lang.String r2 = "*/*"
            zl1 r1 = r0.c(r2, r1)
            if (r1 == 0) goto L45
            android.net.Uri r1 = r1.j()
            if (r1 == 0) goto L45
        L41:
            r1.getClass()
            return r1
        L45:
            se0 r1 = new se0
            java.lang.String r2 = "Could not create save state file"
            r1.<init>(r2)
            throw r1
        L4d:
            se0 r1 = new se0
            java.lang.String r2 = "Could not determine ROM file name"
            r1.<init>(r2)
            throw r1
        L55:
            se0 r1 = new se0
            java.lang.String r2 = "Could not create parent directory document"
            r1.<init>(r2)
            throw r1
    }

    public final java.util.List c(defpackage.pq5 r15) {
            r14 = this;
            r15.getClass()
            zl1 r0 = r14.e(r15)
            if (r0 != 0) goto La
            goto L10
        La:
            java.lang.String r1 = r14.a(r15)
            if (r1 != 0) goto L13
        L10:
            yt1 r14 = defpackage.yt1.A
            return r14
        L13:
            r2 = 9
            c46[] r3 = new defpackage.c46[r2]
            r4 = 0
            r6 = r4
        L19:
            if (r6 >= r2) goto L2d
            java.lang.String r9 = r14.d(r15, r6)
            c46 r5 = new c46
            r8 = 0
            r10 = 32
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r3[r6] = r5
            int r6 = r6 + 1
            goto L19
        L2d:
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)
            r1.getClass()
            java.lang.String r2 = "\\.ml[0-8]"
            java.lang.String r1 = r1.concat(r2)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            zl1[] r0 = r0.o()
            r0.getClass()
            int r2 = r0.length
        L49:
            if (r4 >= r2) goto La8
            r5 = r0[r4]
            java.lang.String r6 = r5.i()
            if (r6 == 0) goto La5
            java.util.regex.Matcher r7 = r1.matcher(r6)
            boolean r7 = r7.matches()
            r8 = 1
            if (r7 != r8) goto La5
            char r6 = defpackage.qs6.w0(r6)
            r7 = 10
            int r9 = java.lang.Character.digit(r6, r7)
            if (r9 < 0) goto L8c
            java.lang.String r12 = r14.d(r15, r9)
            c46 r8 = new c46
            java.util.Date r11 = new java.util.Date
            long r5 = r5.m()
            r11.<init>(r5)
            r13 = 32
            r10 = 1
            r8.<init>(r9, r10, r11, r12, r13)
            b46 r5 = r14.c
            android.net.Uri r5 = r5.b(r15, r8)
            c46 r5 = defpackage.c46.a(r8, r5)
            r3[r9] = r5
            goto La5
        L8c:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Char "
            r15.<init>(r0)
            r15.append(r6)
            java.lang.String r0 = " is not a decimal digit"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        La5:
            int r4 = r4 + 1
            goto L49
        La8:
            java.util.List r14 = defpackage.fv.T0(r3)
            return r14
    }

    public final java.lang.String d(defpackage.pq5 r3, int r4) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "save_state_names"
            r1 = 0
            android.content.Context r2 = r2.a
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.net.Uri r3 = r3.d
            int r3 = r3.hashCode()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "_slot_"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)
            return r2
    }

    public final defpackage.zl1 e(defpackage.pq5 r9) {
            r8 = this;
            kd6 r0 = r8.b
            ng6 r0 = (defpackage.ng6) r0
            r9.getClass()
            a46 r1 = defpackage.a46.SAVE_DIR
            android.content.SharedPreferences r2 = r0.b
            java.lang.String r3 = r1.name()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.String r4 = "save_state_location"
            java.lang.String r2 = r2.getString(r4, r3)
            if (r2 != 0) goto L21
            goto L4c
        L21:
            a46[] r3 = defpackage.a46.values()     // Catch: java.lang.Throwable -> L2a
            java.lang.Enum r3 = defpackage.jw2.o(r2, r3)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r3 = move-exception
            em5 r4 = new em5
            r4.<init>(r3)
            r3 = r4
        L31:
            java.lang.Throwable r4 = defpackage.hm5.a(r3)
            if (r4 == 0) goto L44
            java.lang.String r4 = r1.name()
            java.lang.String r5 = "Invalid enum preference save_state_location="
            java.lang.String r6 = "; using "
            java.lang.String r7 = "SPSettingsRepository"
            defpackage.lb1.w(r5, r2, r6, r4, r7)
        L44:
            boolean r2 = r3 instanceof defpackage.em5
            if (r2 == 0) goto L49
            goto L4a
        L49:
            r1 = r3
        L4a:
            java.lang.Enum r1 = (java.lang.Enum) r1
        L4c:
            a46 r1 = (defpackage.a46) r1
            int[] r2 = defpackage.cg6.b
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L9a
            r2 = 2
            if (r1 == r2) goto L7d
            r9 = 3
            if (r1 != r9) goto L79
            java.io.File r9 = new java.io.File
            java.io.File r0 = r0.j()
            java.lang.String r1 = "savestates"
            r9.<init>(r0, r1)
            boolean r0 = r9.isDirectory()
            if (r0 != 0) goto L74
            r9.mkdirs()
        L74:
            android.net.Uri r9 = android.net.Uri.fromFile(r9)
            goto L9e
        L79:
            defpackage.i.d()
            return r3
        L7d:
            android.net.Uri r9 = r9.e
            if (r9 == 0) goto L92
            uh7 r0 = r0.d
            zl1 r9 = r0.b(r9)
            if (r9 == 0) goto L8e
            android.net.Uri r9 = r9.j()
            goto L8f
        L8e:
            r9 = r3
        L8f:
            if (r9 == 0) goto L92
            goto L9e
        L92:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Could not determine ROMs parent document"
            r8.<init>(r9)
            throw r8
        L9a:
            android.net.Uri r9 = r0.u(r9)
        L9e:
            if (r9 != 0) goto La1
            return r3
        La1:
            uh7 r8 = r8.d
            zl1 r8 = r8.b(r9)
            return r8
    }

    public final void f(defpackage.pq5 r3, int r4, java.lang.String r5) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "save_state_names"
            r1 = 0
            android.content.Context r2 = r2.a
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.net.Uri r3 = r3.d
            int r3 = r3.hashCode()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "_slot_"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            if (r5 == 0) goto L3f
            boolean r4 = defpackage.qs6.v0(r5)
            if (r4 == 0) goto L33
            goto L3f
        L33:
            java.lang.CharSequence r4 = defpackage.qs6.T0(r5)
            java.lang.String r4 = r4.toString()
            r2.putString(r3, r4)
            goto L42
        L3f:
            r2.remove(r3)
        L42:
            r2.apply()
            return
    }
}
