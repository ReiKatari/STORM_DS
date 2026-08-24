package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qg  reason: default package */
/* loaded from: classes.dex */
public final class qg extends dm5 implements eo2 {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.L = i;
        this.Y = obj;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.L;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((qg) q((r41) obj2, (mw6) obj)).s(jg7Var);
            case 1:
                return ((qg) q((r41) obj2, (mw6) obj)).s(jg7Var);
            case 2:
                return ((qg) q((r41) obj2, (mw6) obj)).s(jg7Var);
            default:
                return ((qg) q((r41) obj2, (rb6) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.L;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                qg qgVar = new qg((sg) obj2, r41Var, 0);
                qgVar.X = obj;
                return qgVar;
            case 1:
                qg qgVar2 = new qg((qn2) obj2, r41Var, 1);
                qgVar2.X = obj;
                return qgVar2;
            case 2:
                qg qgVar3 = new qg((w51) obj2, r41Var, 2);
                qgVar3.X = obj;
                return qgVar3;
            default:
                qg qgVar4 = new qg((View) obj2, r41Var, 3);
                qgVar4.X = obj;
                return qgVar4;
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
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg.s(java.lang.Object):java.lang.Object");
    }
}
