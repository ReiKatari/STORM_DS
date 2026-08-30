package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d36  reason: default package */
/* loaded from: classes.dex */
public final class d36 extends j36 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public d36(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.j36
    public final void a(Matrix matrix, w26 w26Var, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((j36) obj).a(this.d, w26Var, i, canvas);
        }
    }
}
