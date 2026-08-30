package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: li4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class li4 implements ki2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ li4(int i, yp0 yp0Var) {
        this.L = yp0Var;
        this.B = i;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        int i2 = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return new ya1(i2, RecyclerView.A1, (ki2) obj);
            default:
                return Integer.valueOf(((lr6) ((yp0) obj).e).b.d(i2));
        }
    }

    public /* synthetic */ li4(int i, ki2 ki2Var) {
        this.B = i;
        this.L = ki2Var;
    }
}
