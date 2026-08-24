package com.github.junrar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Archive implements java.io.Closeable, java.lang.Iterable<com.github.junrar.rarfile.FileHeader> {
    private static final int MAX_HEADER_SIZE = 20971520;
    private static final int PIPE_BUFFER_SIZE = 0;
    private static final boolean USE_EXECUTOR = false;
    private static final defpackage.ry3 logger = null;
    private com.github.junrar.io.SeekableReadOnlyByteChannel channel;
    private int currentHeaderIndex;
    private final com.github.junrar.unpack.ComprDataIO dataIO;
    private final java.util.List<com.github.junrar.rarfile.BaseBlock> headers;
    private com.github.junrar.rarfile.MarkHeader markHead;
    private com.github.junrar.rarfile.MainHeader newMhd;
    private com.github.junrar.rarfile.FileHeader nextFileHeader;
    private java.lang.String password;
    private long totalPackedRead;
    private long totalPackedSize;
    private com.github.junrar.unpack.Unpack unpack;
    private final com.github.junrar.UnrarCallback unrarCallback;
    private com.github.junrar.volume.Volume volume;
    private com.github.junrar.volume.VolumeManager volumeManager;


    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: com.github.junrar.Archive$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype = null;

        static {
                com.github.junrar.rarfile.UnrarHeadertype[] r0 = com.github.junrar.rarfile.UnrarHeadertype.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype = r0
                r1 = 1
                com.github.junrar.rarfile.UnrarHeadertype r2 = com.github.junrar.rarfile.UnrarHeadertype.NewSubHeader     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.junrar.rarfile.UnrarHeadertype r3 = com.github.junrar.rarfile.UnrarHeadertype.FileHeader     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L28
                com.github.junrar.rarfile.UnrarHeadertype r4 = com.github.junrar.rarfile.UnrarHeadertype.ProtectHeader     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L33
                com.github.junrar.rarfile.UnrarHeadertype r5 = com.github.junrar.rarfile.UnrarHeadertype.SubHeader     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L3e
                com.github.junrar.rarfile.UnrarHeadertype r6 = com.github.junrar.rarfile.UnrarHeadertype.MarkHeader     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L49
                com.github.junrar.rarfile.UnrarHeadertype r7 = com.github.junrar.rarfile.UnrarHeadertype.MainHeader     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r6 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L54
                com.github.junrar.rarfile.UnrarHeadertype r7 = com.github.junrar.rarfile.UnrarHeadertype.SignHeader     // Catch: java.lang.NoSuchFieldError -> L54
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r8 = 7
                r6[r7] = r8     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r6 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L60
                com.github.junrar.rarfile.UnrarHeadertype r7 = com.github.junrar.rarfile.UnrarHeadertype.AvHeader     // Catch: java.lang.NoSuchFieldError -> L60
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r8 = 8
                r6[r7] = r8     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r6 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L6c
                com.github.junrar.rarfile.UnrarHeadertype r7 = com.github.junrar.rarfile.UnrarHeadertype.CommHeader     // Catch: java.lang.NoSuchFieldError -> L6c
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r8 = 9
                r6[r7] = r8     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r6 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype     // Catch: java.lang.NoSuchFieldError -> L78
                com.github.junrar.rarfile.UnrarHeadertype r7 = com.github.junrar.rarfile.UnrarHeadertype.EndArcHeader     // Catch: java.lang.NoSuchFieldError -> L78
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r8 = 10
                r6[r7] = r8     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                com.github.junrar.rarfile.SubBlockHeaderType[] r6 = com.github.junrar.rarfile.SubBlockHeaderType.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType = r6
                com.github.junrar.rarfile.SubBlockHeaderType r7 = com.github.junrar.rarfile.SubBlockHeaderType.MAC_HEAD     // Catch: java.lang.NoSuchFieldError -> L89
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r6[r7] = r1     // Catch: java.lang.NoSuchFieldError -> L89
            L89:
                int[] r1 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType     // Catch: java.lang.NoSuchFieldError -> L93
                com.github.junrar.rarfile.SubBlockHeaderType r6 = com.github.junrar.rarfile.SubBlockHeaderType.BEEA_HEAD     // Catch: java.lang.NoSuchFieldError -> L93
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L93
                r1[r6] = r0     // Catch: java.lang.NoSuchFieldError -> L93
            L93:
                int[] r0 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType     // Catch: java.lang.NoSuchFieldError -> L9d
                com.github.junrar.rarfile.SubBlockHeaderType r1 = com.github.junrar.rarfile.SubBlockHeaderType.EA_HEAD     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L9d:
                int[] r0 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType     // Catch: java.lang.NoSuchFieldError -> La7
                com.github.junrar.rarfile.SubBlockHeaderType r1 = com.github.junrar.rarfile.SubBlockHeaderType.NTACL_HEAD     // Catch: java.lang.NoSuchFieldError -> La7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La7
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> La7
            La7:
                int[] r0 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType     // Catch: java.lang.NoSuchFieldError -> Lb1
                com.github.junrar.rarfile.SubBlockHeaderType r1 = com.github.junrar.rarfile.SubBlockHeaderType.STREAM_HEAD     // Catch: java.lang.NoSuchFieldError -> Lb1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb1
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> Lb1
            Lb1:
                int[] r0 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType     // Catch: java.lang.NoSuchFieldError -> Lbb
                com.github.junrar.rarfile.SubBlockHeaderType r1 = com.github.junrar.rarfile.SubBlockHeaderType.UO_HEAD     // Catch: java.lang.NoSuchFieldError -> Lbb
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lbb
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> Lbb
            Lbb:
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class EmptyInputStream extends java.io.InputStream {
        private EmptyInputStream() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ EmptyInputStream(com.github.junrar.Archive.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // java.io.InputStream
        public int read() {
                r0 = this;
                r0 = -1
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class ExtractorExecutorHolder {
        private static final java.util.concurrent.ExecutorService cachedExecutorService = null;
        private static final java.util.concurrent.atomic.AtomicLong threadIndex = null;

        static {
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                com.github.junrar.Archive.ExtractorExecutorHolder.threadIndex = r0
                java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
                int r3 = getMaxThreads()
                int r0 = getThreadKeepAlive()
                long r4 = (long) r0
                java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
                r7.<init>()
                com.github.junrar.a r8 = new com.github.junrar.a
                r8.<init>()
                r2 = 0
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                r1.<init>(r2, r3, r4, r6, r7, r8)
                com.github.junrar.Archive.ExtractorExecutorHolder.cachedExecutorService = r1
                return
        }

        private ExtractorExecutorHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ java.lang.Thread a(java.lang.Runnable r0) {
                java.lang.Thread r0 = lambda$static$0(r0)
                return r0
        }

        public static /* synthetic */ java.util.concurrent.ExecutorService access$200() {
                java.util.concurrent.ExecutorService r0 = com.github.junrar.Archive.ExtractorExecutorHolder.cachedExecutorService
                return r0
        }

        private static int getMaxThreads() {
                bu r0 = new bu
                r1 = 0
                r0.<init>(r1)
                r1 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "junrar.extractor.max-threads"
                java.lang.Object r0 = com.github.junrar.Archive.access$000(r2, r0, r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
        }

        private static int getThreadKeepAlive() {
                bu r0 = new bu
                r1 = 0
                r0.<init>(r1)
                r1 = 5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "junrar.extractor.thread-keep-alive-seconds"
                java.lang.Object r0 = com.github.junrar.Archive.access$000(r2, r0, r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
        }

        private static /* synthetic */ java.lang.Thread lambda$static$0(java.lang.Runnable r4) {
                java.lang.Thread r0 = new java.lang.Thread
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "junrar-extractor-"
                r1.<init>(r2)
                java.util.concurrent.atomic.AtomicLong r2 = com.github.junrar.Archive.ExtractorExecutorHolder.threadIndex
                long r2 = r2.getAndIncrement()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r4, r1)
                r4 = 1
                r0.setDaemon(r4)
                return r0
        }
    }

    static {
            java.lang.Class<com.github.junrar.Archive> r0 = com.github.junrar.Archive.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.Archive.logger = r0
            bu r0 = new bu
            r1 = 0
            r0.<init>(r1)
            r1 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "junrar.extractor.buffer-size"
            java.lang.Object r0 = getPropertyAs(r2, r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.github.junrar.Archive.PIPE_BUFFER_SIZE = r0
            bu r0 = new bu
            r1 = 1
            r0.<init>(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "junrar.extractor.use-executor"
            java.lang.Object r0 = getPropertyAs(r2, r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.github.junrar.Archive.USE_EXECUTOR = r0
            return
    }

    public Archive(com.github.junrar.volume.VolumeManager r4, com.github.junrar.UnrarCallback r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.headers = r0
            r0 = 0
            r3.markHead = r0
            r3.newMhd = r0
            r1 = 0
            r3.totalPackedSize = r1
            r3.totalPackedRead = r1
            r3.volumeManager = r4
            r3.unrarCallback = r5
            r3.password = r6
            com.github.junrar.volume.Volume r4 = r4.nextVolume(r3, r0)     // Catch: com.github.junrar.exception.RarException -> L2a java.io.IOException -> L2c
            r3.setVolume(r4)     // Catch: com.github.junrar.exception.RarException -> L2a java.io.IOException -> L2c
            com.github.junrar.unpack.ComprDataIO r4 = new com.github.junrar.unpack.ComprDataIO
            r4.<init>(r3)
            r3.dataIO = r4
            return
        L2a:
            r4 = move-exception
            goto L2d
        L2c:
            r4 = move-exception
        L2d:
            r3.close()     // Catch: java.io.IOException -> L31
            goto L36
        L31:
            ry3 r3 = com.github.junrar.Archive.logger
            r3.i()
        L36:
            throw r4
    }

    public Archive(java.io.File r2) {
            r1 = this;
            com.github.junrar.volume.FileVolumeManager r0 = new com.github.junrar.volume.FileVolumeManager
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r2, r2)
            return
    }

    public Archive(java.io.File r2, com.github.junrar.UnrarCallback r3) {
            r1 = this;
            com.github.junrar.volume.FileVolumeManager r0 = new com.github.junrar.volume.FileVolumeManager
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r3, r2)
            return
    }

    public Archive(java.io.File r2, com.github.junrar.UnrarCallback r3, java.lang.String r4) {
            r1 = this;
            com.github.junrar.volume.FileVolumeManager r0 = new com.github.junrar.volume.FileVolumeManager
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    public Archive(java.io.File r2, java.lang.String r3) {
            r1 = this;
            com.github.junrar.volume.FileVolumeManager r0 = new com.github.junrar.volume.FileVolumeManager
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public Archive(java.io.InputStream r2) {
            r1 = this;
            com.github.junrar.volume.InputStreamVolumeManager r0 = new com.github.junrar.volume.InputStreamVolumeManager
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r2, r2)
            return
    }

    public Archive(java.io.InputStream r2, com.github.junrar.UnrarCallback r3) {
            r1 = this;
            com.github.junrar.volume.InputStreamVolumeManager r0 = new com.github.junrar.volume.InputStreamVolumeManager
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r3, r2)
            return
    }

    public Archive(java.io.InputStream r2, com.github.junrar.UnrarCallback r3, java.lang.String r4) {
            r1 = this;
            com.github.junrar.volume.InputStreamVolumeManager r0 = new com.github.junrar.volume.InputStreamVolumeManager
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    public Archive(java.io.InputStream r2, java.lang.String r3) {
            r1 = this;
            com.github.junrar.volume.InputStreamVolumeManager r0 = new com.github.junrar.volume.InputStreamVolumeManager
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public static /* synthetic */ java.lang.Object access$000(java.lang.String r0, java.util.function.Function r1, java.lang.Object r2) {
            java.lang.Object r0 = getPropertyAs(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ com.github.junrar.rarfile.FileHeader access$300(com.github.junrar.Archive r0) {
            com.github.junrar.rarfile.FileHeader r0 = r0.nextFileHeader
            return r0
    }

    public static /* synthetic */ com.github.junrar.rarfile.FileHeader access$302(com.github.junrar.Archive r0, com.github.junrar.rarfile.FileHeader r1) {
            r0.nextFileHeader = r1
            return r1
    }

    private void doExtractFile(com.github.junrar.rarfile.FileHeader r3, java.io.OutputStream r4) {
            r2 = this;
            com.github.junrar.unpack.ComprDataIO r0 = r2.dataIO
            r0.init(r4)
            com.github.junrar.unpack.ComprDataIO r4 = r2.dataIO
            r4.init(r3)
            com.github.junrar.unpack.ComprDataIO r4 = r2.dataIO
            boolean r0 = r2.isOldFormat()
            if (r0 == 0) goto L15
            r0 = 0
            goto L17
        L15:
            r0 = -1
        L17:
            r4.setUnpFileCRC(r0)
            com.github.junrar.unpack.Unpack r4 = r2.unpack
            if (r4 != 0) goto L27
            com.github.junrar.unpack.Unpack r4 = new com.github.junrar.unpack.Unpack
            com.github.junrar.unpack.ComprDataIO r0 = r2.dataIO
            r4.<init>(r0)
            r2.unpack = r4
        L27:
            boolean r4 = r3.isSolid()
            if (r4 != 0) goto L33
            com.github.junrar.unpack.Unpack r4 = r2.unpack
            r0 = 0
            r4.init(r0)
        L33:
            com.github.junrar.unpack.Unpack r4 = r2.unpack
            long r0 = r3.getFullUnpackSize()
            r4.setDestSize(r0)
            com.github.junrar.unpack.Unpack r4 = r2.unpack     // Catch: java.lang.Exception -> L5d
            byte r0 = r3.getUnpVersion()     // Catch: java.lang.Exception -> L5d
            boolean r3 = r3.isSolid()     // Catch: java.lang.Exception -> L5d
            r4.doUnpack(r0, r3)     // Catch: java.lang.Exception -> L5d
            com.github.junrar.unpack.ComprDataIO r3 = r2.dataIO     // Catch: java.lang.Exception -> L5d
            com.github.junrar.rarfile.FileHeader r3 = r3.getSubHeader()     // Catch: java.lang.Exception -> L5d
            boolean r4 = r3.isSplitAfter()     // Catch: java.lang.Exception -> L5d
            com.github.junrar.unpack.ComprDataIO r0 = r2.dataIO
            if (r4 == 0) goto L5f
            long r0 = r0.getPackedCRC()     // Catch: java.lang.Exception -> L5d
        L5b:
            long r0 = ~r0     // Catch: java.lang.Exception -> L5d
            goto L64
        L5d:
            r3 = move-exception
            goto L74
        L5f:
            long r0 = r0.getUnpFileCRC()     // Catch: java.lang.Exception -> L5d
            goto L5b
        L64:
            int r3 = r3.getFileCRC()     // Catch: java.lang.Exception -> L5d
            long r3 = (long) r3     // Catch: java.lang.Exception -> L5d
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L6e
            return
        L6e:
            com.github.junrar.exception.CrcErrorException r3 = new com.github.junrar.exception.CrcErrorException     // Catch: java.lang.Exception -> L5d
            r3.<init>()     // Catch: java.lang.Exception -> L5d
            throw r3     // Catch: java.lang.Exception -> L5d
        L74:
            com.github.junrar.unpack.Unpack r2 = r2.unpack
            r2.cleanUp()
            boolean r2 = r3 instanceof com.github.junrar.exception.RarException
            if (r2 == 0) goto L80
            com.github.junrar.exception.RarException r3 = (com.github.junrar.exception.RarException) r3
            throw r3
        L80:
            com.github.junrar.exception.RarException r2 = new com.github.junrar.exception.RarException
            r2.<init>(r3)
            throw r2
    }

    private static <T> T getPropertyAs(java.lang.String r2, java.util.function.Function<java.lang.String, T> r3, T r4) {
            java.lang.String r0 = "default value must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L16 java.lang.SecurityException -> L18
            if (r0 == 0) goto L1a
            boolean r1 = r0.isEmpty()     // Catch: java.lang.NumberFormatException -> L16 java.lang.SecurityException -> L18
            if (r1 != 0) goto L1a
            java.lang.Object r2 = r3.apply(r0)     // Catch: java.lang.NumberFormatException -> L16 java.lang.SecurityException -> L18
            return r2
        L16:
            r3 = move-exception
            goto L1b
        L18:
            r3 = move-exception
            goto L1b
        L1a:
            return r4
        L1b:
            ry3 r0 = com.github.junrar.Archive.logger
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = defpackage.au.h(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1, r4, r3}
            r0.l(r2)
            return r4
    }

    public static /* synthetic */ void h(com.github.junrar.Archive r0, com.github.junrar.rarfile.FileHeader r1, java.io.PipedOutputStream r2) {
            r0.lambda$getInputStream$0(r1, r2)
            return
    }

    private /* synthetic */ void lambda$getInputStream$0(com.github.junrar.rarfile.FileHeader r1, java.io.PipedOutputStream r2) {
            r0 = this;
            r0.extractFile(r1, r2)     // Catch: java.lang.Throwable -> L7 com.github.junrar.exception.RarException -> Lc
            r2.close()     // Catch: java.io.IOException -> Lf
            return
        L7:
            r0 = move-exception
            r2.close()     // Catch: java.io.IOException -> Lb
        Lb:
            throw r0
        Lc:
            r2.close()     // Catch: java.io.IOException -> Lf
        Lf:
            return
    }

    private void readHeaders(long r17) {
            r16 = this;
            r0 = r16
            r1 = 0
            r0.markHead = r1
            r0.newMhd = r1
            java.util.List<com.github.junrar.rarfile.BaseBlock> r2 = r0.headers
            r2.clear()
            r2 = 0
            r0.currentHeaderIndex = r2
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
        L14:
            com.github.junrar.io.RawDataIo r4 = new com.github.junrar.io.RawDataIo
            com.github.junrar.io.SeekableReadOnlyByteChannel r5 = r0.channel
            r4.<init>(r5)
            r5 = 7
            r7 = 20971520(0x1400000, float:3.526483E-38)
            byte[] r8 = safelyAllocate(r5, r7)
            com.github.junrar.rarfile.MainHeader r9 = r0.newMhd
            if (r9 == 0) goto L45
            boolean r9 = r9.isEncrypted()
            if (r9 == 0) goto L45
            r9 = 8
            byte[] r10 = new byte[r9]
            r4.readFully(r10, r9)
            java.lang.String r9 = r0.password     // Catch: java.lang.Exception -> L3e
            javax.crypto.Cipher r9 = com.github.junrar.crypt.Rijndael.buildDecipherer(r9, r10)     // Catch: java.lang.Exception -> L3e
            r4.setCipher(r9)     // Catch: java.lang.Exception -> L3e
            goto L45
        L3e:
            r0 = move-exception
            com.github.junrar.exception.InitDeciphererFailedException r1 = new com.github.junrar.exception.InitDeciphererFailedException
            r1.<init>(r0)
            throw r1
        L45:
            com.github.junrar.io.SeekableReadOnlyByteChannel r9 = r0.channel
            long r9 = r9.getPosition()
            int r11 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r11 < 0) goto L50
            goto L57
        L50:
            int r11 = r8.length
            int r11 = r4.readFully(r8, r11)
            if (r11 != 0) goto L58
        L57:
            return
        L58:
            com.github.junrar.rarfile.BaseBlock r11 = new com.github.junrar.rarfile.BaseBlock
            r11.<init>(r8)
            r11.setPositionInFile(r9)
            com.github.junrar.rarfile.UnrarHeadertype r8 = r11.getHeaderType()
            if (r8 == 0) goto L2be
            int[] r9 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype
            int r8 = r8.ordinal()
            r8 = r9[r8]
            r12 = 8
            r10 = 6
            r14 = 4
            switch(r8) {
                case 5: goto L27d;
                case 6: goto L25f;
                case 7: goto L24b;
                case 8: goto L237;
                case 9: goto L1f7;
                case 10: goto L1b5;
                default: goto L75;
            }
        L75:
            r5 = 4
            byte[] r5 = safelyAllocate(r5, r7)
            int r6 = r5.length
            r4.readFully(r5, r6)
            com.github.junrar.rarfile.BlockHeader r6 = new com.github.junrar.rarfile.BlockHeader
            r6.<init>(r11, r5)
            com.github.junrar.rarfile.UnrarHeadertype r5 = r6.getHeaderType()
            int r5 = r5.ordinal()
            r5 = r9[r5]
            r8 = 1
            if (r5 == r8) goto L163
            r9 = 2
            if (r5 == r9) goto L163
            r9 = 3
            if (r5 == r9) goto L11e
            if (r5 != r14) goto L111
            r14 = 3
            byte[] r5 = safelyAllocate(r14, r7)
            int r11 = r5.length
            r4.readFully(r5, r11)
            com.github.junrar.rarfile.SubBlockHeader r11 = new com.github.junrar.rarfile.SubBlockHeader
            r11.<init>(r6, r5)
            r11.print()
            com.github.junrar.rarfile.SubBlockHeaderType r5 = r11.getSubType()
            if (r5 != 0) goto Lb3
            goto L14
        Lb3:
            int[] r6 = com.github.junrar.Archive.AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r8) goto Lfa
            if (r5 == r9) goto Le1
            if (r5 == r10) goto Lc3
            goto L14
        Lc3:
            short r5 = r11.getHeaderSize(r2)
            int r5 = r5 + (-14)
            long r5 = (long) r5
            byte[] r5 = safelyAllocate(r5, r7)
            int r6 = r5.length
            r4.readFully(r5, r6)
            com.github.junrar.rarfile.UnixOwnersHeader r4 = new com.github.junrar.rarfile.UnixOwnersHeader
            r4.<init>(r11, r5)
            r4.print()
            java.util.List<com.github.junrar.rarfile.BaseBlock> r5 = r0.headers
            r5.add(r4)
            goto L14
        Le1:
            r5 = 10
            byte[] r5 = safelyAllocate(r5, r7)
            int r6 = r5.length
            r4.readFully(r5, r6)
            com.github.junrar.rarfile.EAHeader r4 = new com.github.junrar.rarfile.EAHeader
            r4.<init>(r11, r5)
            r4.print()
            java.util.List<com.github.junrar.rarfile.BaseBlock> r5 = r0.headers
            r5.add(r4)
            goto L14
        Lfa:
            byte[] r5 = safelyAllocate(r12, r7)
            int r6 = r5.length
            r4.readFully(r5, r6)
            com.github.junrar.rarfile.MacInfoHeader r4 = new com.github.junrar.rarfile.MacInfoHeader
            r4.<init>(r11, r5)
            r4.print()
            java.util.List<com.github.junrar.rarfile.BaseBlock> r5 = r0.headers
            r5.add(r4)
            goto L14
        L111:
            ry3 r0 = com.github.junrar.Archive.logger
            java.lang.String r1 = "Unknown Header"
            r0.q(r1)
            com.github.junrar.exception.NotRarArchiveException r0 = new com.github.junrar.exception.NotRarArchiveException
            r0.<init>()
            throw r0
        L11e:
            short r5 = r6.getHeaderSize(r2)
            int r5 = r5 + (-11)
            long r8 = (long) r5
            byte[] r5 = safelyAllocate(r8, r7)
            int r7 = r5.length
            r4.readFully(r5, r7)
            com.github.junrar.rarfile.ProtectHeader r4 = new com.github.junrar.rarfile.ProtectHeader
            r4.<init>(r6, r5)
            long r5 = r4.getPositionInFile()
            boolean r7 = r0.isEncrypted()
            short r7 = r4.getHeaderSize(r7)
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r4.getDataSize()
            long r7 = r7 + r5
            com.github.junrar.io.SeekableReadOnlyByteChannel r4 = r0.channel
            r4.setPosition(r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L15d
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r3.add(r4)
            goto L14
        L15d:
            com.github.junrar.exception.BadRarArchiveException r0 = new com.github.junrar.exception.BadRarArchiveException
            r0.<init>()
            throw r0
        L163:
            short r5 = r6.getHeaderSize(r2)
            int r5 = r5 + (-11)
            long r8 = (long) r5
            byte[] r5 = safelyAllocate(r8, r7)
            int r7 = r5.length     // Catch: java.io.EOFException -> L1ad
            r4.readFully(r5, r7)     // Catch: java.io.EOFException -> L1ad
            com.github.junrar.rarfile.FileHeader r4 = new com.github.junrar.rarfile.FileHeader
            r4.<init>(r6, r5)
            java.util.List<com.github.junrar.rarfile.BaseBlock> r5 = r0.headers
            r5.add(r4)
            long r5 = r4.getPositionInFile()
            boolean r7 = r0.isEncrypted()
            short r7 = r4.getHeaderSize(r7)
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r4.getFullPackSize()
            long r7 = r7 + r5
            com.github.junrar.io.SeekableReadOnlyByteChannel r4 = r0.channel
            r4.setPosition(r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L1a7
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r3.add(r4)
            goto L14
        L1a7:
            com.github.junrar.exception.BadRarArchiveException r0 = new com.github.junrar.exception.BadRarArchiveException
            r0.<init>()
            throw r0
        L1ad:
            com.github.junrar.exception.CorruptHeaderException r0 = new com.github.junrar.exception.CorruptHeaderException
            java.lang.String r1 = "Unexpected end of file"
            r0.<init>(r1)
            throw r0
        L1b5:
            boolean r3 = r11.hasArchiveDataCRC()
            if (r3 == 0) goto L1bc
            r2 = r14
        L1bc:
            boolean r3 = r11.hasVolumeNumber()
            if (r3 == 0) goto L1c4
            int r2 = r2 + 2
        L1c4:
            if (r2 <= 0) goto L1d5
            long r1 = (long) r2
            byte[] r1 = safelyAllocate(r1, r7)
            int r2 = r1.length
            r4.readFully(r1, r2)
            com.github.junrar.rarfile.EndArcHeader r2 = new com.github.junrar.rarfile.EndArcHeader
            r2.<init>(r11, r1)
            goto L1da
        L1d5:
            com.github.junrar.rarfile.EndArcHeader r2 = new com.github.junrar.rarfile.EndArcHeader
            r2.<init>(r11, r1)
        L1da:
            com.github.junrar.rarfile.MainHeader r1 = r0.newMhd
            boolean r1 = r1.isMultiVolume()
            if (r1 != 0) goto L1f1
            boolean r1 = r2.isValid()
            if (r1 == 0) goto L1e9
            goto L1f1
        L1e9:
            com.github.junrar.exception.CorruptHeaderException r0 = new com.github.junrar.exception.CorruptHeaderException
            java.lang.String r1 = "Invalid End Archive Header"
            r0.<init>(r1)
            throw r0
        L1f1:
            java.util.List<com.github.junrar.rarfile.BaseBlock> r0 = r0.headers
            r0.add(r2)
            return
        L1f7:
            r5 = 6
            byte[] r5 = safelyAllocate(r5, r7)
            int r6 = r5.length
            r4.readFully(r5, r6)
            com.github.junrar.rarfile.CommentHeader r4 = new com.github.junrar.rarfile.CommentHeader
            r4.<init>(r11, r5)
            java.util.List<com.github.junrar.rarfile.BaseBlock> r5 = r0.headers
            r5.add(r4)
            long r5 = r4.getPositionInFile()
            boolean r7 = r0.isEncrypted()
            short r4 = r4.getHeaderSize(r7)
            long r7 = (long) r4
            long r5 = r5 + r7
            com.github.junrar.io.SeekableReadOnlyByteChannel r4 = r0.channel
            r4.setPosition(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L231
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r3.add(r4)
            goto L14
        L231:
            com.github.junrar.exception.BadRarArchiveException r0 = new com.github.junrar.exception.BadRarArchiveException
            r0.<init>()
            throw r0
        L237:
            byte[] r5 = safelyAllocate(r5, r7)
            int r6 = r5.length
            r4.readFully(r5, r6)
            com.github.junrar.rarfile.AVHeader r4 = new com.github.junrar.rarfile.AVHeader
            r4.<init>(r11, r5)
            java.util.List<com.github.junrar.rarfile.BaseBlock> r5 = r0.headers
            r5.add(r4)
            goto L14
        L24b:
            byte[] r5 = safelyAllocate(r12, r7)
            int r6 = r5.length
            r4.readFully(r5, r6)
            com.github.junrar.rarfile.SignHeader r4 = new com.github.junrar.rarfile.SignHeader
            r4.<init>(r11, r5)
            java.util.List<com.github.junrar.rarfile.BaseBlock> r5 = r0.headers
            r5.add(r4)
            goto L14
        L25f:
            boolean r5 = r11.hasEncryptVersion()
            if (r5 == 0) goto L266
            r10 = 7
        L266:
            long r5 = (long) r10
            byte[] r5 = safelyAllocate(r5, r7)
            int r6 = r5.length
            r4.readFully(r5, r6)
            com.github.junrar.rarfile.MainHeader r4 = new com.github.junrar.rarfile.MainHeader
            r4.<init>(r11, r5)
            java.util.List<com.github.junrar.rarfile.BaseBlock> r5 = r0.headers
            r5.add(r4)
            r0.newMhd = r4
            goto L14
        L27d:
            com.github.junrar.rarfile.MarkHeader r4 = new com.github.junrar.rarfile.MarkHeader
            r4.<init>(r11)
            r0.markHead = r4
            boolean r4 = r4.isSignature()
            com.github.junrar.rarfile.MarkHeader r5 = r0.markHead
            if (r4 != 0) goto L2a7
            com.github.junrar.rarfile.RARVersion r0 = r5.getVersion()
            com.github.junrar.rarfile.RARVersion r1 = com.github.junrar.rarfile.RARVersion.V5
            if (r0 != r1) goto L2a1
            ry3 r0 = com.github.junrar.Archive.logger
            java.lang.String r1 = "Support for rar version 5 is not yet implemented!"
            r0.q(r1)
            com.github.junrar.exception.UnsupportedRarV5Exception r0 = new com.github.junrar.exception.UnsupportedRarV5Exception
            r0.<init>()
            throw r0
        L2a1:
            com.github.junrar.exception.BadRarArchiveException r0 = new com.github.junrar.exception.BadRarArchiveException
            r0.<init>()
            throw r0
        L2a7:
            boolean r4 = r5.isValid()
            if (r4 == 0) goto L2b6
            java.util.List<com.github.junrar.rarfile.BaseBlock> r4 = r0.headers
            com.github.junrar.rarfile.MarkHeader r5 = r0.markHead
            r4.add(r5)
            goto L14
        L2b6:
            com.github.junrar.exception.CorruptHeaderException r0 = new com.github.junrar.exception.CorruptHeaderException
            java.lang.String r1 = "Invalid Mark Header"
            r0.<init>(r1)
            throw r0
        L2be:
            ry3 r0 = com.github.junrar.Archive.logger
            java.lang.String r1 = "unknown block header!"
            r0.q(r1)
            com.github.junrar.exception.CorruptHeaderException r0 = new com.github.junrar.exception.CorruptHeaderException
            r0.<init>()
            throw r0
    }

    private static byte[] safelyAllocate(long r2, int r4) {
            if (r4 < 0) goto L17
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            long r0 = (long) r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L11
            int r2 = (int) r2
            byte[] r2 = new byte[r2]
            return r2
        L11:
            com.github.junrar.exception.BadRarArchiveException r2 = new com.github.junrar.exception.BadRarArchiveException
            r2.<init>()
            throw r2
        L17:
            java.lang.String r2 = "maxsize must be >= 0"
            defpackage.i.h(r2)
            r2 = 0
            return r2
    }

    private void setChannel(com.github.junrar.io.SeekableReadOnlyByteChannel r3, long r4) {
            r2 = this;
            r0 = 0
            r2.totalPackedSize = r0
            r2.totalPackedRead = r0
            r2.close()
            r2.channel = r3
            r2.readHeaders(r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L47
            goto L15
        Lf:
            r3 = move-exception
            ry3 r4 = com.github.junrar.Archive.logger
            r4.p(r3)
        L15:
            java.util.List<com.github.junrar.rarfile.BaseBlock> r3 = r2.headers
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.next()
            com.github.junrar.rarfile.BaseBlock r4 = (com.github.junrar.rarfile.BaseBlock) r4
            com.github.junrar.rarfile.UnrarHeadertype r5 = r4.getHeaderType()
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.FileHeader
            if (r5 != r0) goto L1b
            long r0 = r2.totalPackedSize
            com.github.junrar.rarfile.FileHeader r4 = (com.github.junrar.rarfile.FileHeader) r4
            long r4 = r4.getFullPackSize()
            long r4 = r4 + r0
            r2.totalPackedSize = r4
            goto L1b
        L3b:
            com.github.junrar.UnrarCallback r3 = r2.unrarCallback
            if (r3 == 0) goto L46
            long r4 = r2.totalPackedRead
            long r0 = r2.totalPackedSize
            r3.volumeProgressChanged(r4, r0)
        L46:
            return
        L47:
            r2 = move-exception
            ry3 r3 = com.github.junrar.Archive.logger
            r3.p(r2)
            throw r2
    }

    public void bytesReadRead(int r5) {
            r4 = this;
            if (r5 <= 0) goto L11
            long r0 = r4.totalPackedRead
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.totalPackedRead = r0
            com.github.junrar.UnrarCallback r5 = r4.unrarCallback
            if (r5 == 0) goto L11
            long r2 = r4.totalPackedSize
            r5.volumeProgressChanged(r0, r2)
        L11:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.github.junrar.io.SeekableReadOnlyByteChannel r0 = r1.channel
            if (r0 == 0) goto La
            r0.close()
            r0 = 0
            r1.channel = r0
        La:
            com.github.junrar.unpack.Unpack r1 = r1.unpack
            if (r1 == 0) goto L11
            r1.cleanUp()
        L11:
            return
    }

    public void extractFile(com.github.junrar.rarfile.FileHeader r2, java.io.OutputStream r3) {
            r1 = this;
            java.util.List<com.github.junrar.rarfile.BaseBlock> r0 = r1.headers
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1a
            r1.doExtractFile(r2, r3)     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r1 = move-exception
            boolean r2 = r1 instanceof com.github.junrar.exception.RarException
            if (r2 == 0) goto L14
            com.github.junrar.exception.RarException r1 = (com.github.junrar.exception.RarException) r1
            throw r1
        L14:
            com.github.junrar.exception.RarException r2 = new com.github.junrar.exception.RarException
            r2.<init>(r1)
            throw r2
        L1a:
            com.github.junrar.exception.HeaderNotInArchiveException r1 = new com.github.junrar.exception.HeaderNotInArchiveException
            r1.<init>()
            throw r1
    }

    public com.github.junrar.io.SeekableReadOnlyByteChannel getChannel() {
            r0 = this;
            com.github.junrar.io.SeekableReadOnlyByteChannel r0 = r0.channel
            return r0
    }

    public java.util.List<com.github.junrar.rarfile.FileHeader> getFileHeaders() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.github.junrar.rarfile.BaseBlock> r4 = r4.headers
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r4.next()
            com.github.junrar.rarfile.BaseBlock r1 = (com.github.junrar.rarfile.BaseBlock) r1
            com.github.junrar.rarfile.UnrarHeadertype r2 = r1.getHeaderType()
            com.github.junrar.rarfile.UnrarHeadertype r3 = com.github.junrar.rarfile.UnrarHeadertype.FileHeader
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lb
            com.github.junrar.rarfile.FileHeader r1 = (com.github.junrar.rarfile.FileHeader) r1
            r0.add(r1)
            goto Lb
        L29:
            return r0
    }

    public java.util.List<com.github.junrar.rarfile.BaseBlock> getHeaders() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.github.junrar.rarfile.BaseBlock> r1 = r1.headers
            r0.<init>(r1)
            return r0
    }

    public java.io.InputStream getInputStream(com.github.junrar.rarfile.FileHeader r5) {
            r4 = this;
            long r0 = r5.getFullUnpackSize()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L11
            com.github.junrar.Archive$EmptyInputStream r4 = new com.github.junrar.Archive$EmptyInputStream
            r5 = 0
            r4.<init>(r5)
            return r4
        L11:
            long r0 = r5.getFullUnpackSize()
            int r2 = com.github.junrar.Archive.PIPE_BUFFER_SIZE
            long r2 = (long) r2
            long r0 = java.lang.Math.min(r0, r2)
            r2 = 1
            long r0 = java.lang.Math.max(r0, r2)
            int r0 = (int) r0
            java.io.PipedInputStream r1 = new java.io.PipedInputStream
            r1.<init>(r0)
            java.io.PipedOutputStream r0 = new java.io.PipedOutputStream
            r0.<init>(r1)
            v r2 = new v
            r3 = 2
            r2.<init>(r4, r5, r0, r3)
            boolean r4 = com.github.junrar.Archive.USE_EXECUTOR
            if (r4 == 0) goto L3f
            java.util.concurrent.ExecutorService r4 = com.github.junrar.Archive.ExtractorExecutorHolder.access$200()
            r4.submit(r2)
            return r1
        L3f:
            java.lang.Thread r4 = new java.lang.Thread
            r4.<init>(r2)
            r4.start()
            return r1
    }

    public com.github.junrar.rarfile.MainHeader getMainHeader() {
            r0 = this;
            com.github.junrar.rarfile.MainHeader r0 = r0.newMhd
            return r0
    }

    public java.lang.String getPassword() {
            r0 = this;
            java.lang.String r0 = r0.password
            return r0
    }

    public com.github.junrar.UnrarCallback getUnrarCallback() {
            r0 = this;
            com.github.junrar.UnrarCallback r0 = r0.unrarCallback
            return r0
    }

    public com.github.junrar.volume.Volume getVolume() {
            r0 = this;
            com.github.junrar.volume.Volume r0 = r0.volume
            return r0
    }

    public com.github.junrar.volume.VolumeManager getVolumeManager() {
            r0 = this;
            com.github.junrar.volume.VolumeManager r0 = r0.volumeManager
            return r0
    }

    public boolean isEncrypted() {
            r0 = this;
            com.github.junrar.rarfile.MainHeader r0 = r0.newMhd
            if (r0 == 0) goto L9
            boolean r0 = r0.isEncrypted()
            return r0
        L9:
            com.github.junrar.exception.MainHeaderNullException r0 = new com.github.junrar.exception.MainHeaderNullException
            r0.<init>()
            throw r0
    }

    public boolean isOldFormat() {
            r0 = this;
            com.github.junrar.rarfile.MarkHeader r0 = r0.markHead
            boolean r0 = r0.isOldFormat()
            return r0
    }

    public boolean isPasswordProtected() {
            r2 = this;
            boolean r0 = r2.isEncrypted()
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            java.util.List r2 = r2.getFileHeaders()
            java.util.stream.Stream r2 = r2.stream()
            cu r0 = new cu
            r1 = 0
            r0.<init>(r1)
            boolean r2 = r2.anyMatch(r0)
            return r2
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.github.junrar.rarfile.FileHeader> iterator() {
            r1 = this;
            com.github.junrar.Archive$1 r0 = new com.github.junrar.Archive$1
            r0.<init>(r1)
            return r0
    }

    public com.github.junrar.rarfile.FileHeader nextFileHeader() {
            r4 = this;
            java.util.List<com.github.junrar.rarfile.BaseBlock> r0 = r4.headers
            int r0 = r0.size()
        L6:
            int r1 = r4.currentHeaderIndex
            if (r1 >= r0) goto L21
            java.util.List<com.github.junrar.rarfile.BaseBlock> r2 = r4.headers
            int r3 = r1 + 1
            r4.currentHeaderIndex = r3
            java.lang.Object r1 = r2.get(r1)
            com.github.junrar.rarfile.BaseBlock r1 = (com.github.junrar.rarfile.BaseBlock) r1
            com.github.junrar.rarfile.UnrarHeadertype r2 = r1.getHeaderType()
            com.github.junrar.rarfile.UnrarHeadertype r3 = com.github.junrar.rarfile.UnrarHeadertype.FileHeader
            if (r2 != r3) goto L6
            com.github.junrar.rarfile.FileHeader r1 = (com.github.junrar.rarfile.FileHeader) r1
            return r1
        L21:
            r4 = 0
            return r4
    }

    public void setPassword(java.lang.String r1) {
            r0 = this;
            r0.password = r1
            return
    }

    public void setVolume(com.github.junrar.volume.Volume r4) {
            r3 = this;
            r3.volume = r4
            com.github.junrar.io.SeekableReadOnlyByteChannel r0 = r4.getChannel()
            long r1 = r4.getLength()
            r3.setChannel(r0, r1)
            return
    }

    public void setVolumeManager(com.github.junrar.volume.VolumeManager r1) {
            r0 = this;
            r0.volumeManager = r1
            return
    }
}
