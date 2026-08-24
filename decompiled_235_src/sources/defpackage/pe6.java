package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pe6  reason: default package */
/* loaded from: classes.dex */
public final class pe6 extends ve6 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public pe6(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.ve6
    public final void a(Matrix matrix, ie6 ie6Var, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ve6) obj).a(this.d, ie6Var, i, canvas);
        }
    }
}
