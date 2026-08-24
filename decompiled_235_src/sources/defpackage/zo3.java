package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo3  reason: default package */
/* loaded from: classes.dex */
public final class zo3 {
    public final /* synthetic */ int a;
    public final ss4 b;
    public final ss4 c;
    public boolean d;
    public Object e;
    public final hq3 f;

    public zo3(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new ss4(i);
                this.c = new ss4(i2);
                this.f = new hq3(i, 30, 100);
                return;
            default:
                this.b = new ss4(i);
                this.c = new ss4(i2);
                this.f = new hq3(i, 90, MlKitException.CODE_SCANNER_UNAVAILABLE);
                return;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        ss4 ss4Var = this.c;
        hq3 hq3Var = this.f;
        ss4 ss4Var2 = this.b;
        switch (i3) {
            case 0:
                if (i < RecyclerView.B1) {
                    s53.a("Index should be non-negative");
                }
                ss4Var2.i(i);
                hq3Var.a(i);
                ss4Var.i(i2);
                return;
            default:
                if (i < RecyclerView.B1) {
                    s53.a("Index should be non-negative (" + i + ')');
                }
                ss4Var2.i(i);
                hq3Var.a(i);
                ss4Var.i(i2);
                return;
        }
    }
}
