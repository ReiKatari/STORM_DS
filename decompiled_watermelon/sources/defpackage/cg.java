package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cg  reason: default package */
/* loaded from: classes.dex */
public final class cg extends jc5 implements aj2 {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg(Object obj, j11 j11Var, int i) {
        super(2, j11Var);
        this.L = i;
        this.Y = obj;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.L;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((cg) t((j11) obj2, (sk6) obj)).v(o27Var);
            case 1:
                return ((cg) t((j11) obj2, (sk6) obj)).v(o27Var);
            case 2:
                return ((cg) t((j11) obj2, (sk6) obj)).v(o27Var);
            default:
                return ((cg) t((j11) obj2, (c06) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.L;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                cg cgVar = new cg((eg) obj2, j11Var, 0);
                cgVar.X = obj;
                return cgVar;
            case 1:
                cg cgVar2 = new cg((mi2) obj2, j11Var, 1);
                cgVar2.X = obj;
                return cgVar2;
            case 2:
                cg cgVar3 = new cg((o21) obj2, j11Var, 2);
                cgVar3.X = obj;
                return cgVar3;
            default:
                cg cgVar4 = new cg((View) obj2, j11Var, 3);
                cgVar4.X = obj;
                return cgVar4;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0096 -> B:36:0x009a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014c -> B:68:0x0150). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.v(java.lang.Object):java.lang.Object");
    }
}
