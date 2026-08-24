package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi  reason: default package */
/* loaded from: classes.dex */
public final class oi implements defpackage.sk0 {
    public final /* synthetic */ int a;
    public final defpackage.jr6 b;
    public final defpackage.kf0 c;

    public oi(defpackage.t57 r1, defpackage.jr6 r2, defpackage.kf0 r3, int r4) {
            r0 = this;
            r0.a = r4
            r1.getClass()
            r3.getClass()
            switch(r4) {
                case 1: goto L13;
                default: goto Lb;
            }
        Lb:
            r0.<init>()
            r0.b = r2
            r0.c = r3
            return
        L13:
            r0.<init>()
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.sk0
    public final defpackage.rk0 a(defpackage.bf0 r10, java.util.Map r11, defpackage.yk0 r12) {
            r9 = this;
            int r0 = r9.a
            zt1 r1 = defpackage.zt1.A
            r2 = 33
            java.lang.String r3 = " for "
            jr6 r4 = r9.b
            kf0 r9 = r9.c
            java.lang.String r5 = "CXCP"
            switch(r0) {
                case 0: goto L95;
                default: goto L11;
            }
        L11:
            d90 r0 = defpackage.d90.q0
            r10.getClass()
            r11.getClass()
            r12.getClass()
            cp4 r11 = defpackage.l.k(r9, r4, r11)
            java.util.ArrayList r4 = r11.a
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L3d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to create OutputConfigurations for "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.w(r5, r9)
            r12.a()
            goto L94
        L3d:
            java.util.ArrayList r9 = r9.d
            if (r9 != 0) goto L46
            boolean r9 = r10.U(r4, r12)
            goto L6d
        L46:
            java.lang.Object r9 = defpackage.gt0.b1(r9)
            y73 r9 = (defpackage.y73) r9
            ji0 r9 = r9.a
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.gt0.b1(r9)
            pp4 r9 = (defpackage.pp4) r9
            j63 r6 = new j63
            android.util.Size r7 = r9.a
            int r7 = r7.getWidth()
            android.util.Size r8 = r9.a
            int r8 = r8.getHeight()
            int r9 = r9.b
            r6.<init>(r7, r8, r9)
            boolean r9 = r10.Z(r6, r4, r12)
        L6d:
            if (r9 != 0) goto L8d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to create capture session from "
            r9.<init>(r11)
            r9.append(r10)
            r9.append(r3)
            r9.append(r12)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r5, r9)
            r12.a()
            goto L94
        L8d:
            qk0 r0 = new qk0
            java.util.LinkedHashMap r9 = r11.d
            r0.<init>(r1, r9)
        L94:
            return r0
        L95:
            d90 r0 = defpackage.d90.q0
            r10.getClass()
            r11.getClass()
            r12.getClass()
            java.util.ArrayList r9 = r9.d
            if (r9 == 0) goto L112
            java.lang.Object r9 = defpackage.gt0.b1(r9)
            y73 r9 = (defpackage.y73) r9
            ji0 r9 = r9.a
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.gt0.b1(r9)
            pp4 r9 = (defpackage.pp4) r9
            android.hardware.camera2.params.InputConfiguration r6 = new android.hardware.camera2.params.InputConfiguration
            android.util.Size r7 = r9.a
            int r7 = r7.getWidth()
            android.util.Size r8 = r9.a
            int r8 = r8.getHeight()
            int r9 = r9.b
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r7 = r11.size()
            r9.<init>(r7)
            java.util.Set r7 = r11.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Ld8:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lee
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getValue()
            android.view.Surface r8 = (android.view.Surface) r8
            r9.add(r8)
            goto Ld8
        Lee:
            boolean r9 = r10.j0(r6, r9, r12)
            if (r9 != 0) goto L15d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to create reprocessable captures session from "
            r9.<init>(r11)
            r9.append(r10)
            r9.append(r3)
            r9.append(r12)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r5, r9)
            r12.a()
            goto L166
        L112:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r6 = r11.size()
            r9.<init>(r6)
            java.util.Set r6 = r11.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L123:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L139
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            android.view.Surface r7 = (android.view.Surface) r7
            r9.add(r7)
            goto L123
        L139:
            boolean r9 = r10.N(r9, r12)
            if (r9 != 0) goto L15d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to create captures session from "
            r9.<init>(r11)
            r9.append(r10)
            r9.append(r3)
            r9.append(r12)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r5, r9)
            r12.a()
            goto L166
        L15d:
            p04 r9 = defpackage.l.g(r11, r4)
            qk0 r0 = new qk0
            r0.<init>(r1, r9)
        L166:
            return r0
    }
}
