package defpackage;

import android.os.Build;
import android.window.BackEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b00  reason: default package */
/* loaded from: classes.dex */
public final class b00 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b00(BackEvent backEvent) {
        this(r1, r2, r3, r4, r5);
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        long j;
        backEvent.getClass();
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        if (Build.VERSION.SDK_INT >= 36) {
            j = backEvent.getFrameTimeMillis();
        } else {
            j = 0;
        }
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }

    public b00(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b00(hd4 hd4Var) {
        this(hd4Var.c, hd4Var.d, hd4Var.b, hd4Var.a, hd4Var.e);
        hd4Var.getClass();
    }
}
