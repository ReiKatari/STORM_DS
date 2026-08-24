package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d33  reason: default package */
/* loaded from: classes.dex */
public final class d33 {
    public final java.lang.String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final java.util.ArrayList i;
    public final defpackage.c33 j;
    public boolean k;

    public d33(java.lang.String r12, float r13, float r14, float r15, float r16, long r17, int r19, boolean r20, int r21) {
            r11 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L6
            java.lang.String r12 = ""
        L6:
            r0 = r21 & 32
            if (r0 == 0) goto Ld
            long r0 = defpackage.kt0.h
            goto Lf
        Ld:
            r0 = r17
        Lf:
            r2 = r21 & 64
            if (r2 == 0) goto L15
            r2 = 5
            goto L17
        L15:
            r2 = r19
        L17:
            r11.<init>()
            r11.a = r12
            r11.b = r13
            r11.c = r14
            r11.d = r15
            r12 = r16
            r11.e = r12
            r11.f = r0
            r11.g = r2
            r12 = r20
            r11.h = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.i = r12
            c33 r0 = new c33
            r9 = 0
            r10 = 1023(0x3ff, float:1.434E-42)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.j = r0
            r12.add(r0)
            return
    }

    public static void a(defpackage.d33 r16, java.util.ArrayList r17, int r18, defpackage.cn6 r19) {
            r0 = r16
            boolean r1 = r0.k
            if (r1 == 0) goto Lb
            java.lang.String r1 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            defpackage.p53.c(r1)
        Lb:
            java.util.ArrayList r0 = r0.i
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            c33 r0 = (defpackage.c33) r0
            java.util.ArrayList r0 = r0.j
            hl7 r1 = new hl7
            java.lang.String r2 = ""
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 2
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r3 = r17
            r4 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.add(r1)
            return
    }

    public final defpackage.e33 b() {
            r17 = this;
            r0 = r17
            boolean r1 = r0.k
            java.lang.String r2 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector"
            if (r1 == 0) goto Lb
            defpackage.p53.c(r2)
        Lb:
            java.util.ArrayList r1 = r0.i
            int r3 = r1.size()
            r4 = 1
            if (r3 <= r4) goto L50
            boolean r3 = r0.k
            if (r3 == 0) goto L1b
            defpackage.p53.c(r2)
        L1b:
            int r3 = r1.size()
            int r3 = r3 - r4
            java.lang.Object r3 = r1.remove(r3)
            c33 r3 = (defpackage.c33) r3
            int r5 = r1.size()
            int r5 = r5 - r4
            java.lang.Object r1 = r1.get(r5)
            c33 r1 = (defpackage.c33) r1
            java.util.ArrayList r1 = r1.j
            dl7 r4 = new dl7
            java.lang.String r5 = r3.a
            float r6 = r3.b
            float r7 = r3.c
            float r8 = r3.d
            float r9 = r3.e
            float r10 = r3.f
            float r11 = r3.g
            float r12 = r3.h
            java.util.List r13 = r3.i
            java.util.ArrayList r14 = r3.j
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.add(r4)
            goto Lb
        L50:
            e33 r5 = new e33
            dl7 r6 = new dl7
            c33 r1 = r0.j
            java.lang.String r7 = r1.a
            float r8 = r1.b
            float r9 = r1.c
            float r10 = r1.d
            float r11 = r1.e
            float r12 = r1.f
            float r13 = r1.g
            float r14 = r1.h
            java.util.List r15 = r1.i
            java.util.ArrayList r1 = r1.j
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            int r14 = r0.g
            boolean r15 = r0.h
            r11 = r6
            java.lang.String r6 = r0.a
            float r7 = r0.b
            float r8 = r0.c
            float r9 = r0.d
            float r10 = r0.e
            long r12 = r0.f
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14, r15)
            r0.k = r4
            return r5
    }
}
