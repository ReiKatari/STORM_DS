package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vj2  reason: default package */
/* loaded from: classes.dex */
public abstract class vj2 {
    public final int a;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vj2(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.b = r2
            r7.c = r2
            r7.d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = defpackage.xj2.k(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L71
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = defpackage.xj2.k(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L6b
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L65
            java.lang.String r4 = "glCreateProgram"
            defpackage.xj2.b(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            defpackage.xj2.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            defpackage.xj2.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0 = 1
            int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r5 = 35714(0x8b82, float:5.0046E-41)
            r6 = 0
            android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4 = r4[r6]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            if (r4 != r0) goto L4c
            r7.a = r3     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r7.a()
            return
        L48:
            r7 = move-exception
            goto L73
        L4a:
            r7 = move-exception
            goto L73
        L4c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0.append(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r7.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            throw r7     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
        L62:
            r7 = move-exception
        L63:
            r3 = r2
            goto L73
        L65:
            r7 = move-exception
            goto L63
        L67:
            r7 = move-exception
        L68:
            r9 = r2
        L69:
            r3 = r9
            goto L73
        L6b:
            r7 = move-exception
            goto L68
        L6d:
            r7 = move-exception
        L6e:
            r8 = r2
            r9 = r8
            goto L69
        L71:
            r7 = move-exception
            goto L6e
        L73:
            if (r8 == r2) goto L78
            android.opengl.GLES20.glDeleteShader(r8)
        L78:
            if (r9 == r2) goto L7d
            android.opengl.GLES20.glDeleteShader(r9)
        L7d:
            if (r3 == r2) goto L82
            android.opengl.GLES20.glDeleteProgram(r3)
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj2.<init>(java.lang.String, java.lang.String):void");
    }

    public final void a() {
        int i = this.a;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.d = glGetAttribLocation;
        xj2.e(glGetAttribLocation, "aPosition");
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.b = glGetUniformLocation;
        xj2.e(glGetUniformLocation, "uTransMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.c = glGetUniformLocation2;
        xj2.e(glGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.a);
        xj2.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        xj2.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) xj2.h);
        xj2.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        xj2.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.c, 1.0f);
        xj2.b("glUniform1f");
    }
}
