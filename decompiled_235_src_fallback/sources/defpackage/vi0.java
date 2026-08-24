package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi0  reason: default package */
/* loaded from: classes.dex */
public class vi0 {
    public static final defpackage.vi0 a = null;

    static {
            vi0 r0 = new vi0
            r0.<init>()
            defpackage.vi0.a = r0
            return
    }

    public void a(defpackage.zi7 r13, defpackage.dk0 r14) {
            r12 = this;
            r13.getClass()
            xx r12 = defpackage.zi7.H
            r0 = 0
            java.lang.Object r12 = r13.b(r12, r0)
            ek0 r12 = (defpackage.ek0) r12
            go4 r1 = defpackage.go4.L
            r1.getClass()
            xx r2 = defpackage.ek0.f
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            da4 r3 = defpackage.da4.d()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            sa4 r5 = defpackage.sa4.a()
            ek0 r6 = new ek0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            go4 r8 = defpackage.go4.a(r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r4)
            sy6 r2 = defpackage.sy6.b
            android.util.ArrayMap r2 = new android.util.ArrayMap
            r2.<init>()
            android.util.ArrayMap r3 = r5.a
            java.util.Set r4 = r3.keySet()
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r3.get(r5)
            r2.put(r5, r9)
            goto L46
        L5a:
            sy6 r11 = new sy6
            r11.<init>(r2)
            r9 = -1
            r6.<init>(r7, r8, r9, r10, r11)
            if (r12 == 0) goto L9c
            int r9 = r12.c
            java.util.List r1 = r12.d
            r14.c(r1)
            go4 r1 = r12.b
            sy6 r2 = r12.e
            java.lang.Object r3 = r14.Y
            sa4 r3 = (defpackage.sa4) r3
            android.util.ArrayMap r3 = r3.a
            android.util.ArrayMap r2 = r2.a
            r3.putAll(r2)
            java.util.ArrayList r12 = r12.a
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r12.getClass()
            java.util.Iterator r12 = r12.iterator()
        L88:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L9c
            java.lang.Object r2 = r12.next()
            ig1 r2 = (defpackage.ig1) r2
            java.lang.Object r3 = r14.R
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.add(r2)
            goto L88
        L9c:
            da4 r12 = defpackage.da4.k(r1)
            r14.X = r12
            kd0 r12 = new kd0
            r12.<init>(r13)
            xx r12 = defpackage.kd0.Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r12 = r13.b(r12, r1)
            r12.getClass()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r14.L = r12
            xx r12 = defpackage.kd0.e0
            java.lang.Object r12 = r13.b(r12, r0)
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r12 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r12
            if (r12 == 0) goto Lce
            ti0 r0 = new ti0
            r0.<init>(r12)
            r14.d(r0)
        Lce:
            jd0 r12 = new jd0
            r0 = 2
            r12.<init>(r0)
            pk0 r0 = new pk0
            r1 = 0
            r0.<init>(r1, r12, r13)
            r13.h(r0)
            os0 r13 = new os0
            da4 r12 = r12.B
            go4 r12 = defpackage.go4.a(r12)
            r13.<init>(r12)
            r14.e(r13)
            return
    }
}
