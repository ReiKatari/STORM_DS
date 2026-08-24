package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cx7 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ cx7(String str, int i) {
        this.A = i;
        this.B = str;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ww7, java.lang.Object] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        j36 i0;
        int i = this.A;
        String str = this.B;
        e36 e36Var = (e36) obj;
        switch (i) {
            case 0:
                e36Var.getClass();
                i0 = e36Var.i0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    i0.w(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        String R = i0.R(0);
                        iw7 f = ds7.f((int) i0.getLong(1));
                        R.getClass();
                        f.getClass();
                        ?? obj2 = new Object();
                        obj2.a = R;
                        obj2.b = f;
                        arrayList.add(obj2);
                    }
                    return arrayList;
                } finally {
                }
            default:
                e36Var.getClass();
                i0 = e36Var.i0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    i0.w(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.f0()) {
                        arrayList2.add(i0.R(0));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
