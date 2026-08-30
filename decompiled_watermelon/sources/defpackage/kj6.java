package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kj6  reason: default package */
/* loaded from: classes.dex */
public final class kj6 {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 < i2) {
                    if (i3 == iArr[i4]) {
                        break;
                    }
                    i4++;
                } else {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                }
            }
        }
    }

    public final void a(pj6 pj6Var) {
        this.a.add(pj6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(java.util.ArrayList r14) {
        /*
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lc
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
        Lc:
            int r0 = r14.size()
            java.util.ArrayList r13 = r13.a
            int r1 = r13.size()
            if (r0 == r1) goto L1a
            goto La0
        L1a:
            int r0 = r13.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int[] r2 = new int[r0]
            r3 = 0
            b(r1, r0, r2, r3)
            int r0 = r14.size()
            pj6[] r0 = new defpackage.pj6[r0]
            int r2 = r1.size()
            r4 = r3
        L34:
            if (r4 >= r2) goto La0
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            int[] r5 = (int[]) r5
            r6 = 1
            r7 = r3
            r8 = r6
        L41:
            int r9 = r13.size()
            if (r7 >= r9) goto L99
            r9 = r5[r7]
            int r10 = r14.size()
            if (r9 >= r10) goto L96
            java.lang.Object r9 = r13.get(r7)
            pj6 r9 = (defpackage.pj6) r9
            r10 = r5[r7]
            java.lang.Object r10 = r14.get(r10)
            pj6 r10 = (defpackage.pj6) r10
            r9.getClass()
            r10.getClass()
            lj6 r11 = r10.b
            int r11 = r11.getId()
            lj6 r12 = r9.b
            int r12 = r12.getId()
            if (r11 <= r12) goto L73
        L71:
            r9 = r3
            goto L88
        L73:
            nj6 r11 = r10.a
            nj6 r12 = r9.a
            if (r11 == r12) goto L7a
            goto L71
        L7a:
            cg6 r9 = r9.c
            cg6 r11 = defpackage.cg6.DEFAULT
            if (r9 == r11) goto L87
            cg6 r10 = r10.c
            if (r10 == r11) goto L87
            if (r10 == r9) goto L87
            goto L71
        L87:
            r9 = r6
        L88:
            r8 = r8 & r9
            if (r8 != 0) goto L8c
            goto L99
        L8c:
            r9 = r5[r7]
            java.lang.Object r10 = r13.get(r7)
            pj6 r10 = (defpackage.pj6) r10
            r0[r9] = r10
        L96:
            int r7 = r7 + 1
            goto L41
        L99:
            if (r8 == 0) goto L34
            java.util.List r13 = java.util.Arrays.asList(r0)
            return r13
        La0:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj6.c(java.util.ArrayList):java.util.List");
    }
}
