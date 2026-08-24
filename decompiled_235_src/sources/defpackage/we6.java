package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we6  reason: default package */
/* loaded from: classes.dex */
public final class we6 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public we6() {
        d(RecyclerView.B1, 270.0f, RecyclerView.B1);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            se6 se6Var = new se6(f4, f5, f4, f5);
            se6Var.f = this.d;
            se6Var.g = f3;
            this.g.add(new qe6(se6Var));
            this.d = f;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ue6) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [te6, ue6, java.lang.Object] */
    public final void c(float f, float f2) {
        ?? ue6Var = new ue6();
        ue6Var.b = f;
        ue6Var.c = f2;
        this.f.add(ue6Var);
        re6 re6Var = new re6(ue6Var, this.b, this.c);
        a(re6Var.b() + 270.0f);
        this.g.add(re6Var);
        this.d = re6Var.b() + 270.0f;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = RecyclerView.B1;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
