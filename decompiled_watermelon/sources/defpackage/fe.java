package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fe  reason: default package */
/* loaded from: classes.dex */
public final class fe extends bq0 {
    public final /* synthetic */ int Y;
    public final /* synthetic */ z1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe(z1 z1Var, int i) {
        super(4);
        this.Y = i;
        this.Z = z1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:419:0x084b, code lost:
        if (r5 == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012e, code lost:
        if (defpackage.iz5.j(4, r5).isEmpty() != false) goto L652;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0c9f  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0ceb  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x082d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v49, types: [pp1] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.t2 w0(int r45) {
        /*
            Method dump skipped, instructions count: 3348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.w0(int):t2");
    }

    @Override // defpackage.bq0
    public void O(int i, t2 t2Var, String str, Bundle bundle) {
        switch (this.Y) {
            case 0:
                ((ke) this.Z).j(i, t2Var, str, bundle);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.bq0
    public final t2 Q(int i) {
        switch (this.Y) {
            case 0:
                return w0(i);
            default:
                return new t2(AccessibilityNodeInfo.obtain(((co0) this.Z).n(i).a));
        }
    }

    @Override // defpackage.bq0
    public final t2 V(int i) {
        int i2;
        int i3 = this.Y;
        z1 z1Var = this.Z;
        switch (i3) {
            case 0:
                ke keVar = (ke) z1Var;
                if (i != 1) {
                    if (i == 2) {
                        return Q(keVar.f0);
                    }
                    i.i(wh1.g(i, "Unknown focus type: "));
                    return null;
                }
                int i4 = keVar.g0;
                if (i4 == Integer.MIN_VALUE) {
                    return null;
                }
                return Q(i4);
            default:
                co0 co0Var = (co0) z1Var;
                if (i == 2) {
                    i2 = co0Var.f0;
                } else {
                    i2 = co0Var.g0;
                }
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return Q(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
        if (r7 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x07e7, code lost:
        if (r1 != 16) goto L626;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v31, types: [b2, f2] */
    /* JADX WARN: Type inference failed for: r5v10, types: [b2, d2] */
    /* JADX WARN: Type inference failed for: r5v8, types: [b2, e2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0241 -> B:159:0x0242). Please submit an issue!!! */
    @Override // defpackage.bq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0(int r28, int r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 2474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.b0(int, int, android.os.Bundle):boolean");
    }
}
