package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp6  reason: default package */
/* loaded from: classes.dex */
public final class wp6 {
    public int a;
    public defpackage.f61 b;
    public int[][] c;
    public defpackage.f61[] d;

    public wp6() {
            r2 = this;
            r2.<init>()
            r0 = 10
            int[][] r1 = new int[r0]
            r2.c = r1
            f61[] r0 = new defpackage.f61[r0]
            r2.d = r0
            return
    }

    public static defpackage.wp6 b(defpackage.f61 r2) {
            wp6 r0 = new wp6
            r0.<init>()
            int[] r1 = android.util.StateSet.WILD_CARD
            r0.a(r1, r2)
            return r0
    }

    public final void a(int[] r6, defpackage.f61 r7) {
            r5 = this;
            int r0 = r5.a
            if (r0 == 0) goto L7
            int r1 = r6.length
            if (r1 != 0) goto L9
        L7:
            r5.b = r7
        L9:
            int[][] r1 = r5.c
            int r2 = r1.length
            if (r0 < r2) goto L21
            int r2 = r0 + 10
            int[][] r3 = new int[r2]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r0)
            r5.c = r3
            f61[] r1 = new defpackage.f61[r2]
            f61[] r2 = r5.d
            java.lang.System.arraycopy(r2, r4, r1, r4, r0)
            r5.d = r1
        L21:
            int[][] r0 = r5.c
            int r1 = r5.a
            r0[r1] = r6
            f61[] r6 = r5.d
            r6[r1] = r7
            int r1 = r1 + 1
            r5.a = r1
            return
    }

    public final defpackage.f61 c(int[] r6) {
            r5 = this;
            int[][] r0 = r5.c
            r1 = 0
            r2 = r1
        L4:
            int r3 = r5.a
            r4 = -1
            if (r2 >= r3) goto L15
            r3 = r0[r2]
            boolean r3 = android.util.StateSet.stateSetMatches(r3, r6)
            if (r3 == 0) goto L12
            goto L16
        L12:
            int r2 = r2 + 1
            goto L4
        L15:
            r2 = r4
        L16:
            if (r2 >= 0) goto L2e
            int[] r6 = android.util.StateSet.WILD_CARD
            int[][] r0 = r5.c
        L1c:
            int r2 = r5.a
            if (r1 >= r2) goto L2d
            r2 = r0[r1]
            boolean r2 = android.util.StateSet.stateSetMatches(r2, r6)
            if (r2 == 0) goto L2a
            r4 = r1
            goto L2d
        L2a:
            int r1 = r1 + 1
            goto L1c
        L2d:
            r2 = r4
        L2e:
            if (r2 >= 0) goto L33
            f61 r5 = r5.b
            return r5
        L33:
            f61[] r5 = r5.d
            r5 = r5[r2]
            return r5
    }

    public final void d(android.content.Context r12, android.content.res.XmlResourceParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
            r11 = this;
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r13.next()
            if (r2 == r1) goto L72
            int r3 = r13.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto L72
        L15:
            r4 = 2
            if (r2 != r4) goto L6
            if (r3 > r0) goto L6
            java.lang.String r2 = r13.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            goto L6
        L27:
            android.content.res.Resources r2 = r12.getResources()
            int[] r3 = defpackage.a75.y
            r4 = 0
            if (r15 != 0) goto L35
            android.content.res.TypedArray r2 = r2.obtainAttributes(r14, r3)
            goto L39
        L35:
            android.content.res.TypedArray r2 = r15.obtainStyledAttributes(r14, r3, r4, r4)
        L39:
            t r3 = new t
            r5 = 0
            r3.<init>(r5)
            r5 = 5
            f61 r3 = defpackage.me6.c(r2, r5, r3)
            r2.recycle()
            int r2 = r14.getAttributeCount()
            int[] r5 = new int[r2]
            r6 = r4
            r7 = r6
        L4f:
            if (r6 >= r2) goto L6a
            int r8 = r14.getAttributeNameResource(r6)
            r9 = 2130968959(0x7f04017f, float:1.7546586E38)
            if (r8 == r9) goto L67
            int r9 = r7 + 1
            boolean r10 = r14.getAttributeBooleanValue(r6, r4)
            if (r10 == 0) goto L63
            goto L64
        L63:
            int r8 = -r8
        L64:
            r5[r7] = r8
            r7 = r9
        L67:
            int r6 = r6 + 1
            goto L4f
        L6a:
            int[] r2 = android.util.StateSet.trimStateSet(r5, r7)
            r11.a(r2, r3)
            goto L6
        L72:
            return
    }
}
