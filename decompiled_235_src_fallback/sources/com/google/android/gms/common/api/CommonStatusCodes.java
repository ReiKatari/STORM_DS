package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CommonStatusCodes {
    public static final int API_NOT_CONNECTED = 17;
    public static final int CANCELED = 16;
    public static final int CONNECTION_SUSPENDED_DURING_CALL = 20;
    public static final int DEVELOPER_ERROR = 10;
    public static final int ERROR = 13;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 14;
    public static final int INVALID_ACCOUNT = 5;
    public static final int NETWORK_ERROR = 7;
    public static final int RECONNECTION_TIMED_OUT = 22;
    public static final int RECONNECTION_TIMED_OUT_DURING_UPDATE = 21;
    public static final int REMOTE_EXCEPTION = 19;
    public static final int RESOLUTION_REQUIRED = 6;
    @java.lang.Deprecated
    public static final int SERVICE_DISABLED = 3;
    @java.lang.Deprecated
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int SUCCESS_CACHE = -1;
    public static final int TIMEOUT = 15;

    public CommonStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStatusCodeString(int r1) {
            switch(r1) {
                case -1: goto L43;
                case 0: goto L40;
                case 1: goto L3;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L2e;
                case 8: goto L2b;
                case 9: goto L3;
                case 10: goto L28;
                case 11: goto L3;
                case 12: goto L3;
                case 13: goto L25;
                case 14: goto L22;
                case 15: goto L1f;
                case 16: goto L1c;
                case 17: goto L19;
                case 18: goto L16;
                case 19: goto L13;
                case 20: goto L10;
                case 21: goto Ld;
                case 22: goto La;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "unknown status code: "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            return r1
        La:
            java.lang.String r1 = "RECONNECTION_TIMED_OUT"
            return r1
        Ld:
            java.lang.String r1 = "RECONNECTION_TIMED_OUT_DURING_UPDATE"
            return r1
        L10:
            java.lang.String r1 = "CONNECTION_SUSPENDED_DURING_CALL"
            return r1
        L13:
            java.lang.String r1 = "REMOTE_EXCEPTION"
            return r1
        L16:
            java.lang.String r1 = "DEAD_CLIENT"
            return r1
        L19:
            java.lang.String r1 = "API_NOT_CONNECTED"
            return r1
        L1c:
            java.lang.String r1 = "CANCELED"
            return r1
        L1f:
            java.lang.String r1 = "TIMEOUT"
            return r1
        L22:
            java.lang.String r1 = "INTERRUPTED"
            return r1
        L25:
            java.lang.String r1 = "ERROR"
            return r1
        L28:
            java.lang.String r1 = "DEVELOPER_ERROR"
            return r1
        L2b:
            java.lang.String r1 = "INTERNAL_ERROR"
            return r1
        L2e:
            java.lang.String r1 = "NETWORK_ERROR"
            return r1
        L31:
            java.lang.String r1 = "RESOLUTION_REQUIRED"
            return r1
        L34:
            java.lang.String r1 = "INVALID_ACCOUNT"
            return r1
        L37:
            java.lang.String r1 = "SIGN_IN_REQUIRED"
            return r1
        L3a:
            java.lang.String r1 = "SERVICE_DISABLED"
            return r1
        L3d:
            java.lang.String r1 = "SERVICE_VERSION_UPDATE_REQUIRED"
            return r1
        L40:
            java.lang.String r1 = "SUCCESS"
            return r1
        L43:
            java.lang.String r1 = "SUCCESS_CACHE"
            return r1
    }
}
