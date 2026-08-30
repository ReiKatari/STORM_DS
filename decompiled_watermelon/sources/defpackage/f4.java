package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f4 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ k24 B;

    public /* synthetic */ f4(k24 k24Var, int i) {
        this.A = i;
        this.B = k24Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        b44 b44Var;
        String str;
        int i = this.A;
        boolean z = true;
        String str2 = null;
        o27 o27Var = o27.a;
        k24 k24Var = this.B;
        switch (i) {
            case 0:
                k24Var.setValue(null);
                return o27Var;
            case 1:
                k24Var.setValue(Boolean.valueOf(!((Boolean) k24Var.getValue()).booleanValue()));
                return o27Var;
            case 2:
                k24Var.setValue(null);
                return o27Var;
            case 3:
                rd3 rd3Var = (rd3) k24Var.getValue();
                if (rd3Var != null) {
                    return rd3Var;
                }
                pz2.d("Required value was null.");
                f81.c();
                return null;
            case 4:
                k24Var.setValue(Boolean.TRUE);
                return o27Var;
            case 5:
                k24Var.setValue(Boolean.FALSE);
                return o27Var;
            case ig7.b /* 6 */:
                k24Var.setValue(Boolean.valueOf(!((Boolean) k24Var.getValue()).booleanValue()));
                return o27Var;
            case 7:
                rd3 rd3Var2 = (rd3) k24Var.getValue();
                if (rd3Var2 != null) {
                    return rd3Var2;
                }
                pz2.d("Required value was null.");
                f81.c();
                return null;
            case 8:
                if (k24Var == null) {
                    return null;
                }
                return (List) k24Var.getValue();
            case 9:
                k24Var.setValue(Boolean.TRUE);
                return o27Var;
            case 10:
                k24Var.setValue(Boolean.FALSE);
                return o27Var;
            case 11:
                k24Var.setValue(al0.b);
                return o27Var;
            case mj2.L /* 12 */:
                k24Var.setValue(zk0.b);
                return o27Var;
            case 13:
                l34 l34Var = (l34) k24Var.getValue();
                if (l34Var != null && (b44Var = l34Var.B) != null && (str = (String) b44Var.B.e) != null) {
                    str2 = zg6.W0(str, "/");
                }
                if (!b53.x(str2, tm0.Companion.serializer().e().b()) && !b53.x(str2, qm0.Companion.serializer().e().b())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                k24Var.setValue(dt4.FILL_AREA);
                return o27Var;
            case ig7.e /* 15 */:
                k24Var.setValue(dt4.VERTICAL_ALIGNMENT);
                return o27Var;
            case 16:
                Boolean bool = (Boolean) k24Var.getValue();
                bool.booleanValue();
                return bool;
            case 17:
                k24Var.setValue(u51.MAIN);
                return o27Var;
            case 18:
                k24Var.setValue(Boolean.TRUE);
                return o27Var;
            case 19:
                k24Var.setValue(Boolean.FALSE);
                return o27Var;
            case 20:
                k24Var.setValue(Boolean.FALSE);
                return o27Var;
            case 21:
                k24Var.setValue(Boolean.FALSE);
                return o27Var;
            case 22:
                k24Var.setValue(Boolean.FALSE);
                return o27Var;
            case 23:
                k24Var.setValue(Boolean.TRUE);
                return o27Var;
            case 24:
                k24Var.setValue(Boolean.FALSE);
                return o27Var;
            case 25:
                return new ph3((mi2) k24Var.getValue());
            case 26:
                return (ej3) ((ki2) k24Var.getValue()).c();
            case 27:
                return new ek3((mi2) k24Var.getValue());
            case 28:
                k24Var.setValue(null);
                return o27Var;
            default:
                rd3 rd3Var3 = (rd3) k24Var.getValue();
                if (rd3Var3 != null) {
                    return rd3Var3;
                }
                pz2.d("Required value was null.");
                f81.c();
                return null;
        }
    }
}
