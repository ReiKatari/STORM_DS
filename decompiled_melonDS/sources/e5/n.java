package e5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f4369a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0295, code lost:
        if (r7.f4281d == r6) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0115, code lost:
        if (r4.f4281d == r8) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0692 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06e9 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(e5.h r39, c5.c r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.n.a(e5.h, c5.c, java.util.ArrayList, int):void");
    }

    public static void b(h hVar, c5.c cVar, g gVar) {
        gVar.f4315o = -1;
        d dVar = gVar.M;
        d dVar2 = gVar.L;
        d dVar3 = gVar.J;
        d dVar4 = gVar.K;
        d dVar5 = gVar.I;
        gVar.f4317p = -1;
        f fVar = hVar.T[0];
        f fVar2 = f.WRAP_CONTENT;
        if (fVar != fVar2 && gVar.T[0] == f.MATCH_PARENT) {
            int i2 = dVar5.f4284g;
            int r5 = hVar.r() - dVar4.f4284g;
            dVar5.f4286i = cVar.k(dVar5);
            dVar4.f4286i = cVar.k(dVar4);
            cVar.d(dVar5.f4286i, i2);
            cVar.d(dVar4.f4286i, r5);
            gVar.f4315o = 2;
            gVar.Z = i2;
            int i10 = r5 - i2;
            gVar.V = i10;
            int i11 = gVar.f4293c0;
            if (i10 < i11) {
                gVar.V = i11;
            }
        }
        if (hVar.T[1] != fVar2 && gVar.T[1] == f.MATCH_PARENT) {
            int i12 = dVar3.f4284g;
            int l10 = hVar.l() - dVar2.f4284g;
            dVar3.f4286i = cVar.k(dVar3);
            dVar2.f4286i = cVar.k(dVar2);
            cVar.d(dVar3.f4286i, i12);
            cVar.d(dVar2.f4286i, l10);
            if (gVar.f4291b0 > 0 || gVar.f4303h0 == 8) {
                c5.g k10 = cVar.k(dVar);
                dVar.f4286i = k10;
                cVar.d(k10, gVar.f4291b0 + i12);
            }
            gVar.f4317p = 2;
            gVar.f4289a0 = i12;
            int i13 = l10 - i12;
            gVar.W = i13;
            int i14 = gVar.f4295d0;
            if (i13 < i14) {
                gVar.W = i14;
            }
        }
    }

    public static final boolean c(int i2, int i10) {
        if ((i2 & i10) == i10) {
            return true;
        }
        return false;
    }
}
