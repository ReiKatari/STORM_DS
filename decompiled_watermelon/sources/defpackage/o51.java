package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Map;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o51  reason: default package */
/* loaded from: classes.dex */
public final class o51 implements us1 {
    public float A;
    public float B;
    public int C;
    public int D;
    public final EmulatorActivity a;
    public js5 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public k26 h;
    public k26 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public bs5 p;
    public boolean q;
    public Rect r;
    public Rect s;
    public boolean v;
    public Rect w;
    public Rect x;
    public boolean z;
    public final Object b = new Object();
    public final Object o = new Object();
    public float t = 1.0f;
    public float u = 1.0f;
    public float y = 1.0f;

    public o51(EmulatorActivity emulatorActivity) {
        this.a = emulatorActivity;
    }

    public static final void f(ArrayList arrayList, ArrayList arrayList2, n51 n51Var) {
        if (n51Var.d) {
            arrayList.add(n51Var);
        } else {
            arrayList2.add(n51Var);
        }
    }

    public final void a() {
        VideoFiltering videoFiltering;
        char c = '\f';
        float[] fArr = {RecyclerView.A1, 0.4974093f, RecyclerView.A1, RecyclerView.A1, 1.0f, RecyclerView.A1, RecyclerView.A1, 0.4974093f, 1.0f, RecyclerView.A1, 1.0f, 0.4974093f};
        float[] fArr2 = {RecyclerView.A1, 1.0f, RecyclerView.A1, 0.50259066f, 1.0f, 0.50259066f, RecyclerView.A1, 1.0f, 1.0f, 0.50259066f, 1.0f, 1.0f};
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.v) {
            Rect rect = this.r;
            if (rect != null) {
                f(arrayList2, arrayList, new n51(rect, fArr, this.t, false));
            }
            Rect rect2 = this.s;
            if (rect2 != null) {
                f(arrayList2, arrayList, new n51(rect2, fArr2, this.u, true));
            }
        } else {
            Rect rect3 = this.s;
            if (rect3 != null) {
                f(arrayList2, arrayList, new n51(rect3, fArr2, this.u, false));
            }
            Rect rect4 = this.r;
            if (rect4 != null) {
                f(arrayList2, arrayList, new n51(rect4, fArr, this.t, true));
            }
        }
        Rect rect5 = this.w;
        if (rect5 != null) {
            f(arrayList2, arrayList, new n51(rect5, fArr, this.y, this.z));
        }
        Rect rect6 = this.x;
        if (rect6 != null) {
            f(arrayList2, arrayList, new n51(rect6, fArr2, this.y, this.z));
        }
        ArrayList X0 = tq0.X0(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        int size = X0.size();
        int i = 0;
        while (i < size) {
            Object obj = X0.get(i);
            i++;
            n51 n51Var = (n51) obj;
            Rect rect7 = n51Var.a;
            float[] fArr3 = n51Var.b;
            float f = n51Var.c;
            float x = ((rect7.getX() / this.A) * 2.0f) - 1.0f;
            char c2 = c;
            float width = (((rect7.getWidth() + rect7.getX()) / this.A) * 2.0f) - 1.0f;
            float y = 1.0f - ((rect7.getY() / this.B) * 2.0f);
            float height = 1.0f - (((rect7.getHeight() + rect7.getY()) / this.B) * 2.0f);
            float f2 = fArr3[0];
            float f3 = fArr3[1];
            float f4 = fArr3[2];
            float f5 = fArr3[3];
            float f6 = fArr3[4];
            float f7 = fArr3[5];
            float f8 = fArr3[6];
            float f9 = fArr3[7];
            float f10 = fArr3[8];
            float f11 = fArr3[9];
            float f12 = fArr3[10];
            float f13 = fArr3[11];
            float[] fArr4 = new float[30];
            fArr4[0] = x;
            fArr4[1] = height;
            fArr4[2] = f2;
            fArr4[3] = f3;
            fArr4[4] = f;
            fArr4[5] = x;
            fArr4[6] = y;
            fArr4[7] = f4;
            fArr4[8] = f5;
            fArr4[9] = f;
            fArr4[10] = width;
            fArr4[11] = y;
            fArr4[c2] = f6;
            fArr4[13] = f7;
            fArr4[14] = f;
            fArr4[15] = x;
            fArr4[16] = height;
            fArr4[17] = f8;
            fArr4[18] = f9;
            fArr4[19] = f;
            fArr4[20] = width;
            fArr4[21] = y;
            fArr4[22] = f10;
            fArr4[23] = f11;
            fArr4[24] = f;
            fArr4[25] = width;
            fArr4[26] = height;
            fArr4[27] = f12;
            fArr4[28] = f13;
            fArr4[29] = f;
            tq0.D0(arrayList3, new lu(1, fArr4));
            c = c2;
        }
        float[] l1 = tq0.l1(arrayList3);
        int length = l1.length * 4;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(l1);
        asFloatBuffer.position(0);
        GLES30.glBindVertexArray(this.k);
        GLES20.glBindBuffer(34962, this.j);
        GLES20.glBufferData(34962, length, asFloatBuffer, 35044);
        this.l = asFloatBuffer.capacity() / 5;
        k26 k26Var = this.h;
        if (k26Var != null) {
            GLES20.glDeleteShader(k26Var.a);
            GLES20.glDeleteShader(k26Var.b);
            GLES20.glDeleteProgram(k26Var.c);
        }
        js5 js5Var = this.c;
        if (js5Var == null || (videoFiltering = js5Var.b) == null) {
            videoFiltering = VideoFiltering.NONE;
        }
        Map map = n87.a;
        videoFiltering.getClass();
        t26 t26Var = (t26) n87.a.get(videoFiltering);
        if (t26Var == null) {
            t26Var = t26.e;
        }
        this.h = gk2.C(t26Var);
    }

    public final void b(ct4 ct4Var) {
        ct4Var.getClass();
        synchronized (this.b) {
            if (this.d) {
                a();
                this.d = false;
            }
        }
        GLES20.glClear(16640);
        if (ct4Var.a) {
            synchronized (this.o) {
                d();
            }
            k26 k26Var = this.h;
            if (k26Var != null) {
                GLES20.glDisable(2929);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                GLES30.glBindVertexArray(this.k);
                GLES20.glBindBuffer(34962, this.j);
                GLES20.glUseProgram(k26Var.c);
                GLES20.glEnableVertexAttribArray(k26Var.e);
                GLES20.glEnableVertexAttribArray(k26Var.f);
                int i = k26Var.g;
                if (i != -1) {
                    GLES20.glEnableVertexAttribArray(i);
                }
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, ct4Var.b);
                GLES20.glTexParameteri(3553, 10241, k26Var.d);
                GLES20.glTexParameteri(3553, 10240, k26Var.d);
                GLES20.glVertexAttribPointer(k26Var.f, 2, 5126, false, 20, 0);
                GLES20.glVertexAttribPointer(k26Var.e, 2, 5126, false, 20, 8);
                GLES20.glVertexAttribPointer(k26Var.g, 1, 5126, false, 20, 16);
                GLES20.glUniform1i(k26Var.h, 0);
                GLES20.glDrawArrays(4, 0, this.l);
                GLES30.glBindVertexArray(0);
                GLES20.glBindBuffer(34962, 0);
            }
        }
    }

    public final void c() {
        GLES20.glClearColor(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 1.0f);
        GLES20.glClear(16640);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.g = i;
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        GLES20.glGenBuffers(2, iArr2, 0);
        GLES30.glGenVertexArrays(2, iArr3, 0);
        this.j = iArr2[0];
        this.k = iArr3[0];
        this.m = iArr2[1];
        this.n = iArr3[1];
        this.i = gk2.C(t26.d);
        synchronized (this.b) {
            this.d = true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(4:10|11|(2:13|14)|16)|(9:22|(2:27|23)|28|29|(1:31)(1:39)|32|(1:34)|35|(1:37))|42|28|29|(0)(0)|32|(0)|35|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
        r0 = new defpackage.kc5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:40:0x006c, B:42:0x0076), top: B:111:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o51.d():void");
    }

    public final void e(Rect rect, Rect rect2, float f, float f2, boolean z, Rect rect3, Rect rect4, float f3, boolean z2) {
        synchronized (this.b) {
            this.r = rect;
            this.s = rect2;
            this.t = f;
            this.u = f2;
            this.v = z;
            this.w = rect3;
            this.x = rect4;
            this.y = f3;
            this.z = z2;
            this.d = true;
        }
    }
}
