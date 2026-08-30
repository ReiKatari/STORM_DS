package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k36  reason: default package */
/* loaded from: classes.dex */
public final class k36 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public k36() {
        d(RecyclerView.A1, 270.0f, RecyclerView.A1);
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
            g36 g36Var = new g36(f4, f5, f4, f5);
            g36Var.f = this.d;
            g36Var.g = f3;
            this.g.add(new e36(g36Var));
            this.d = f;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i36) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h36, java.lang.Object, i36] */
    public final void c(float f, float f2) {
        ?? i36Var = new i36();
        i36Var.b = f;
        i36Var.c = f2;
        this.f.add(i36Var);
        f36 f36Var = new f36(i36Var, this.b, this.c);
        a(f36Var.b() + 270.0f);
        this.g.add(f36Var);
        this.d = f36Var.b() + 270.0f;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = RecyclerView.A1;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
