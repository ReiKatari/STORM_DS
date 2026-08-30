package di;

import a4.n;
import android.net.Uri;
import android.os.Vibrator;
import android.view.textclassifier.TextClassifier;
import androidx.preference.SwitchPreference;
import bd.l;
import bd.v;
import cc.c;
import cd.i;
import d0.b1;
import e.h;
import ec.j;
import g2.t1;
import g2.w4;
import g2.z0;
import h1.i2;
import h1.p0;
import h1.p2;
import h1.r1;
import h1.w;
import j1.f;
import j1.g;
import java.util.ArrayList;
import k7.m0;
import kf.l0;
import m7.c0;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import n2.w0;
import nc.t;
import yb.y;
import zc.u;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f4106b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, m7.p pVar2, c cVar) {
        super(2, cVar);
        this.X = 29;
        this.Z = (j) pVar;
        this.f4106b0 = pVar2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((b) t((c) obj2, (v) obj)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 2:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 3:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 4:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 7:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 8:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8508d /* 9 */:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8510f /* 10 */:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 11:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 12:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 13:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 14:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8512h /* 15 */:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 16:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 17:
                return ((b) t((c) obj2, (i) obj)).v(y.f14813a);
            case 18:
                return ((b) t((c) obj2, (i) obj)).v(y.f14813a);
            case 19:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 20:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 21:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 22:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 23:
                return ((b) t((c) obj2, (i) obj)).v(y.f14813a);
            case 24:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 25:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 26:
                return ((b) t((c) obj2, (Uri) obj)).v(y.f14813a);
            case 27:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            case 28:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
            default:
                return ((b) t((c) obj2, (u) obj)).v(y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ec.j, mc.p] */
    @Override // ec.a
    public final c t(c cVar, Object obj) {
        switch (this.X) {
            case 0:
                b bVar = new b(0, cVar, (SwitchPreference) this.f4106b0);
                bVar.Z = obj;
                return bVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new b(1, cVar, (h) this.f4106b0);
            case 2:
                return new b((n) this.Z, (Vibrator) this.f4106b0, cVar, 2);
            case 3:
                return new b((j1.i) this.Z, (f) this.f4106b0, cVar, 3);
            case 4:
                return new b((j1.i) this.Z, (g) this.f4106b0, cVar, 4);
            case l1.c.f8511g /* 5 */:
                return new b((TextClassifier) this.Z, (p) ((j) this.f4106b0), cVar);
            case l1.c.f8509e /* 6 */:
                return new b((t1) this.Z, (z0) this.f4106b0, cVar, 6);
            case 7:
                return new b((t1) this.Z, (j1.h) this.f4106b0, cVar, 7);
            case 8:
                return new b((p0) this.Z, (w0) this.f4106b0, cVar, 8);
            case l1.c.f8508d /* 9 */:
                return new b((w4) this.Z, (b4.g) this.f4106b0, cVar, 9);
            case l1.c.f8510f /* 10 */:
                b bVar2 = new b(10, cVar, (l) this.f4106b0);
                bVar2.Z = obj;
                return bVar2;
            case 11:
                b bVar3 = new b(11, cVar, (b1) this.f4106b0);
                bVar3.Z = obj;
                return bVar3;
            case 12:
                return new b((p2) this.Z, (p) this.f4106b0, cVar, 12);
            case 13:
                return new b((w) this.Z, (i2) this.f4106b0, cVar, 13);
            case 14:
                return new b((y0) this.Z, (r1) this.f4106b0, cVar, 14);
            case l1.c.f8512h /* 15 */:
                return new b((h4.c) this.Z, (Runnable) this.f4106b0, cVar, 15);
            case 16:
                return new b((j1.i) this.Z, (w0) this.f4106b0, cVar, 16);
            case 17:
                b bVar4 = new b(17, cVar, (jg.u) this.f4106b0);
                bVar4.Z = obj;
                return bVar4;
            case 18:
                b bVar5 = new b(18, cVar, (ArrayList) this.f4106b0);
                bVar5.Z = obj;
                return bVar5;
            case 19:
                return new b((jg.u) this.Z, (kg.i) this.f4106b0, cVar, 19);
            case 20:
                return new b((jg.u) this.Z, (Cheat) this.f4106b0, cVar, 20);
            case 21:
                return new b((m0) this.Z, (mc.a) this.f4106b0, cVar, 21);
            case 22:
                return new b((kf.g) this.Z, (Uri) this.f4106b0, cVar, 22);
            case 23:
                b bVar6 = new b(23, cVar, (l0) this.f4106b0);
                bVar6.Z = obj;
                return bVar6;
            case 24:
                b bVar7 = new b(24, cVar, (l2.a) this.f4106b0);
                bVar7.Z = obj;
                return bVar7;
            case 25:
                return new b((l2.g) this.Z, (d1.j) this.f4106b0, cVar, 25);
            case 26:
                b bVar8 = new b(26, cVar, (lf.f) this.f4106b0);
                bVar8.Z = obj;
                return bVar8;
            case 27:
                return new b((p) this.Z, (c0) this.f4106b0, cVar, 27);
            case 28:
                return new b((p) this.Z, (t) this.f4106b0, cVar, 28);
            default:
                return new b((p) ((j) this.Z), (m7.p) this.f4106b0, cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x0500, code lost:
        if (r0.a(r2, r4) == r1) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0512, code lost:
        if (r2 == r1) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x05c5, code lost:
        if (((zc.y0) r4.Z).G(r4) == r0) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0778, code lost:
        if (r5.isTouchExplorationEnabled() != false) goto L454;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:595:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [nc.p] */
    /* JADX WARN: Type inference failed for: r1v116, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v40, types: [zc.y0] */
    /* JADX WARN: Type inference failed for: r1v44, types: [zc.y0] */
    /* JADX WARN: Type inference failed for: r3v76, types: [qf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ec.j, mc.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:337:0x06ae -> B:326:0x0666). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di.b.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TextClassifier textClassifier, p pVar, c cVar) {
        super(2, cVar);
        this.X = 5;
        this.Z = textClassifier;
        this.f4106b0 = (j) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
        this.f4106b0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, c cVar, Object obj) {
        super(2, cVar);
        this.X = i2;
        this.f4106b0 = obj;
    }
}
