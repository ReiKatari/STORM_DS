package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo2  reason: default package */
/* loaded from: classes.dex */
public abstract class zo2 {
    public final int a;
    public int b;
    public int c;
    public int d;

    public zo2(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.b = r2
            r7.c = r2
            r7.d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = defpackage.bp2.k(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L71
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = defpackage.bp2.k(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L6b
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L65
            java.lang.String r4 = "glCreateProgram"
            defpackage.bp2.b(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            defpackage.bp2.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            defpackage.bp2.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
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
    }

    public final void a() {
            r3 = this;
            int r0 = r3.a
            java.lang.String r1 = "aPosition"
            int r2 = android.opengl.GLES20.glGetAttribLocation(r0, r1)
            r3.d = r2
            defpackage.bp2.e(r2, r1)
            java.lang.String r1 = "uTransMatrix"
            int r2 = android.opengl.GLES20.glGetUniformLocation(r0, r1)
            r3.b = r2
            defpackage.bp2.e(r2, r1)
            java.lang.String r1 = "uAlphaScale"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)
            r3.c = r0
            defpackage.bp2.e(r0, r1)
            return
    }

    public void b() {
            r7 = this;
            int r0 = r7.a
            android.opengl.GLES20.glUseProgram(r0)
            java.lang.String r0 = "glUseProgram"
            defpackage.bp2.b(r0)
            int r0 = r7.d
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            java.lang.String r0 = "glEnableVertexAttribArray"
            defpackage.bp2.b(r0)
            int r1 = r7.d
            r4 = 0
            java.nio.FloatBuffer r6 = defpackage.bp2.h
            r2 = 2
            r3 = 5126(0x1406, float:7.183E-42)
            r5 = 0
            android.opengl.GLES20.glVertexAttribPointer(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "glVertexAttribPointer"
            defpackage.bp2.b(r0)
            r0 = 16
            float[] r0 = new float[r0]
            r1 = 0
            android.opengl.Matrix.setIdentityM(r0, r1)
            int r2 = r7.b
            r3 = 1
            android.opengl.GLES20.glUniformMatrix4fv(r2, r3, r1, r0, r1)
            java.lang.String r0 = "glUniformMatrix4fv"
            defpackage.bp2.b(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r7 = r7.c
            android.opengl.GLES20.glUniform1f(r7, r0)
            java.lang.String r7 = "glUniform1f"
            defpackage.bp2.b(r7)
            return
    }
}
