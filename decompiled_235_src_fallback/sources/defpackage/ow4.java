package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow4  reason: default package */
/* loaded from: classes.dex */
public final class ow4 extends android.os.Handler {
    public final /* synthetic */ int a;

    public /* synthetic */ ow4(android.os.Looper r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.<init>(r1)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r12) {
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            android.os.Message r12 = r11.obtainMessage()
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.sendMessageDelayed(r12, r0)
            return
        Lf:
            int r11 = r12.what
            r0 = 3
            if (r11 == r0) goto Ld4
            r0 = 8
            r1 = 1
            r2 = 0
            if (r11 == r0) goto L84
            r0 = 13
            if (r11 != r0) goto L6e
            java.lang.Object r11 = r12.obj
            java.util.List r11 = (java.util.List) r11
            int r12 = r11.size()
            r0 = r2
        L27:
            if (r0 >= r12) goto Le6
            java.lang.Object r3 = r11.get(r0)
            i33 r3 = (defpackage.i33) r3
            sw4 r4 = r3.a
            r4.getClass()
            boolean r5 = defpackage.e44.shouldReadFromMemoryCache(r2)
            r6 = 0
            if (r5 == 0) goto L5f
            java.lang.String r5 = r3.d
            s63 r7 = r4.d
            java.lang.Object r7 = r7.B
            nr1 r7 = (defpackage.nr1) r7
            java.lang.Object r5 = r7.get(r5)
            xz3 r5 = (defpackage.xz3) r5
            if (r5 == 0) goto L4e
            android.graphics.Bitmap r5 = r5.a
            goto L4f
        L4e:
            r5 = r6
        L4f:
            pq6 r7 = r4.e
            if (r5 == 0) goto L59
            sk1 r7 = r7.b
            r7.sendEmptyMessage(r2)
            goto L60
        L59:
            sk1 r7 = r7.b
            r7.sendEmptyMessage(r1)
            goto L60
        L5f:
            r5 = r6
        L60:
            if (r5 == 0) goto L68
            qw4 r7 = defpackage.qw4.MEMORY
            r4.b(r5, r7, r3, r6)
            goto L6b
        L68:
            r4.c(r3)
        L6b:
            int r0 = r0 + 1
            goto L27
        L6e:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            int r12 = r12.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown handler message received: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L84:
            java.lang.Object r11 = r12.obj
            java.util.List r11 = (java.util.List) r11
            int r12 = r11.size()
            r0 = r2
        L8d:
            if (r0 >= r12) goto Le6
            java.lang.Object r3 = r11.get(r0)
            v40 r3 = (defpackage.v40) r3
            sw4 r4 = r3.B
            r4.getClass()
            i33 r5 = r3.f0
            java.util.ArrayList r6 = r3.g0
            if (r6 == 0) goto La8
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto La8
            r7 = r1
            goto La9
        La8:
            r7 = r2
        La9:
            if (r5 != 0) goto Lad
            if (r7 == 0) goto Ld1
        Lad:
            m44 r8 = r3.Z
            java.lang.Object r8 = r8.B
            java.lang.Exception r8 = r3.k0
            android.graphics.Bitmap r9 = r3.h0
            qw4 r3 = r3.j0
            if (r5 == 0) goto Lbc
            r4.b(r9, r3, r5, r8)
        Lbc:
            if (r7 == 0) goto Ld1
            int r5 = r6.size()
            r7 = r2
        Lc3:
            if (r7 >= r5) goto Ld1
            java.lang.Object r10 = r6.get(r7)
            i33 r10 = (defpackage.i33) r10
            r4.b(r9, r3, r10, r8)
            int r7 = r7 + 1
            goto Lc3
        Ld1:
            int r0 = r0 + 1
            goto L8d
        Ld4:
            java.lang.Object r11 = r12.obj
            i33 r11 = (defpackage.i33) r11
            sw4 r12 = r11.a
            r12.getClass()
            sw4 r12 = r11.a
            java.lang.Object r11 = r11.a()
            r12.a(r11)
        Le6:
            return
    }
}
