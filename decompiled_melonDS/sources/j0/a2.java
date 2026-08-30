package j0;

import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7151a;

    public a2(f2... f2VarArr) {
        ArrayList arrayList = new ArrayList();
        this.f7151a = arrayList;
        Collections.addAll(arrayList, f2VarArr);
    }

    public static void b(ArrayList arrayList, int i2, int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i11 = 0; i11 < i2; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 < i10) {
                    if (i11 == iArr[i12]) {
                        break;
                    }
                    i12++;
                } else {
                    iArr[i10] = i11;
                    b(arrayList, i2, iArr, i10 + 1);
                    break;
                }
            }
        }
    }

    public final void a(f2 f2Var) {
        this.f7151a.add(f2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(java.util.List r15) {
        /*
            r14 = this;
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto Lc
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            return r15
        Lc:
            int r0 = r15.size()
            java.util.ArrayList r1 = r14.f7151a
            int r2 = r1.size()
            if (r0 == r2) goto L1a
            goto La3
        L1a:
            int r0 = r1.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int[] r3 = new int[r0]
            r4 = 0
            b(r2, r0, r3, r4)
            int r0 = r15.size()
            j0.f2[] r0 = new j0.f2[r0]
            int r3 = r2.size()
            r5 = r4
        L34:
            if (r5 >= r3) goto L9c
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            int[] r6 = (int[]) r6
            r7 = 1
            r8 = r4
            r9 = r7
        L41:
            int r10 = r1.size()
            if (r8 >= r10) goto L99
            r10 = r6[r8]
            int r11 = r15.size()
            if (r10 >= r11) goto L96
            java.lang.Object r10 = r1.get(r8)
            j0.f2 r10 = (j0.f2) r10
            r11 = r6[r8]
            java.lang.Object r11 = r15.get(r11)
            j0.f2 r11 = (j0.f2) r11
            r10.getClass()
            r11.getClass()
            j0.b2 r12 = r11.f7197b
            int r12 = r12.getId()
            j0.b2 r13 = r10.f7197b
            int r13 = r13.getId()
            if (r12 <= r13) goto L73
        L71:
            r10 = r4
            goto L88
        L73:
            j0.d2 r12 = r11.f7196a
            j0.d2 r13 = r10.f7196a
            if (r12 == r13) goto L7a
            goto L71
        L7a:
            j0.z1 r10 = r10.f7198c
            j0.z1 r12 = j0.z1.DEFAULT
            if (r10 == r12) goto L87
            j0.z1 r11 = r11.f7198c
            if (r11 == r12) goto L87
            if (r11 == r10) goto L87
            goto L71
        L87:
            r10 = r7
        L88:
            r9 = r9 & r10
            if (r9 != 0) goto L8c
            goto L99
        L8c:
            r10 = r6[r8]
            java.lang.Object r11 = r1.get(r8)
            j0.f2 r11 = (j0.f2) r11
            r0[r10] = r11
        L96:
            int r8 = r8 + 1
            goto L41
        L99:
            if (r9 == 0) goto L34
            r4 = r7
        L9c:
            if (r4 == 0) goto La3
            java.util.List r15 = java.util.Arrays.asList(r0)
            return r15
        La3:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a2.c(java.util.List):java.util.List");
    }

    public a2() {
        this.f7151a = new ArrayList();
    }
}
