package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dy6  reason: default package */
/* loaded from: classes.dex */
public final class dy6 extends p06 {
    public final p83 a;
    public final i73 b;
    public final qo2 c;
    public final n07 d;
    public final ez6 e;
    public final dz4 f = new dz4(this);
    public final boolean g;
    public volatile dz6 h;

    public dy6(p83 p83Var, i73 i73Var, qo2 qo2Var, n07 n07Var, ez6 ez6Var, boolean z) {
        this.a = p83Var;
        this.b = i73Var;
        this.c = qo2Var;
        this.d = n07Var;
        this.e = ez6Var;
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    @Override // defpackage.dz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.o83 r4) {
        /*
            r3 = this;
            i73 r0 = r3.b
            if (r0 != 0) goto L19
            dz6 r0 = r3.h
            if (r0 != 0) goto L14
            qo2 r0 = r3.c
            ez6 r1 = r3.e
            n07 r2 = r3.d
            dz6 r0 = r0.e(r1, r2)
            r3.h = r0
        L14:
            java.lang.Object r3 = r0.b(r4)
            return r3
        L19:
            r4.n0()     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L30 defpackage.ft3 -> L37 java.io.EOFException -> L3e
            r1 = 0
            r73 r2 = defpackage.r73.a     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 defpackage.ft3 -> L37
            r2.getClass()     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 defpackage.ft3 -> L37
            l73 r4 = defpackage.r73.d(r4)     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 defpackage.ft3 -> L37
            goto L44
        L27:
            r4 = move-exception
            goto L40
        L29:
            r3 = move-exception
            u73 r4 = new u73
            r4.<init>(r3)
            throw r4
        L30:
            r3 = move-exception
            u73 r4 = new u73
            r4.<init>(r3)
            throw r4
        L37:
            r3 = move-exception
            u73 r4 = new u73
            r4.<init>(r3)
            throw r4
        L3e:
            r4 = move-exception
            r1 = 1
        L40:
            if (r1 == 0) goto L5c
            c83 r4 = defpackage.c83.A
        L44:
            boolean r1 = r3.g
            if (r1 == 0) goto L51
            r4.getClass()
            boolean r1 = r4 instanceof defpackage.c83
            if (r1 == 0) goto L51
            r3 = 0
            return r3
        L51:
            n07 r1 = r3.d
            java.lang.reflect.Type r1 = r1.b
            dz4 r3 = r3.f
            java.lang.Object r3 = r0.b(r4, r1, r3)
            return r3
        L5c:
            u73 r3 = new u73
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy6.b(o83):java.lang.Object");
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        p83 p83Var = this.a;
        if (p83Var == null) {
            dz6 dz6Var = this.h;
            if (dz6Var == null) {
                dz6Var = this.c.e(this.e, this.d);
                this.h = dz6Var;
            }
            dz6Var.c(b93Var, obj);
        } else if (this.g && obj == null) {
            b93Var.F();
        } else {
            l73 a = p83Var.a(obj, this.d.b, this.f);
            r73.a.getClass();
            r73.g(b93Var, a);
        }
    }

    @Override // defpackage.p06
    public final dz6 d() {
        if (this.a != null) {
            return this;
        }
        dz6 dz6Var = this.h;
        if (dz6Var == null) {
            dz6 e = this.c.e(this.e, this.d);
            this.h = e;
            return e;
        }
        return dz6Var;
    }
}
