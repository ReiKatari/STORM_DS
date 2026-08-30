package defpackage;

import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: je3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class je3 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ b B;

    public /* synthetic */ je3(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        b bVar = this.B;
        switch (i) {
            case 0:
                b.a(bVar, (String) obj);
                return o27Var;
            case 1:
                b.f(bVar, (String) obj);
                return o27Var;
            case 2:
                b.m(bVar, (BackgroundMode) obj);
                return o27Var;
            case 3:
                ((hd3) obj).getClass();
                bVar.v(true);
                return o27Var;
            default:
                b.d(bVar, (cd3) obj);
                return o27Var;
        }
    }
}
