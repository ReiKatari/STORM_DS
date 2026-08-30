package d5;

import android.view.View;
import java.io.Serializable;
import java.util.HashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f3835c = new e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3836d = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3837a;

    /* renamed from: b  reason: collision with root package name */
    public Serializable f3838b;

    public e(int i2) {
        this.f3837a = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f3838b = new HashMap();
                return;
            default:
                this.f3838b = "identity";
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0152, code lost:
        if (r19.equals("linear") == false) goto L33;
     */
    /* JADX WARN: Type inference failed for: r1v21, types: [d5.k, d5.e] */
    /* JADX WARN: Type inference failed for: r1v22, types: [d5.e, d5.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d5.e d(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e.d(java.lang.String):d5.e");
    }

    public double b(double d4) {
        return 1.0d;
    }

    public float c(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = (HashMap) this.f3838b;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public String toString() {
        switch (this.f3837a) {
            case 0:
                return (String) this.f3838b;
            default:
                return super.toString();
        }
    }

    public double a(double d4) {
        return d4;
    }
}
