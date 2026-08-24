package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileHeader extends com.github.junrar.rarfile.BlockHeader {
    private static final long NANOS_PER_UNIT = 100;
    private static final byte NEWLHD_SIZE = 32;
    private static final byte SALT_SIZE = 8;
    private static final defpackage.ry3 logger = null;
    private java.nio.file.attribute.FileTime aTime;
    private java.nio.file.attribute.FileTime arcTime;
    private java.nio.file.attribute.FileTime cTime;
    private int fileAttr;
    private final int fileCRC;
    private java.lang.String fileName;
    private final byte[] fileNameBytes;
    private java.lang.String fileNameW;
    private long fullPackSize;
    private long fullUnpackSize;
    private final int highPackSize;
    private int highUnpackSize;
    private final com.github.junrar.rarfile.HostSystem hostOS;
    private java.nio.file.attribute.FileTime mTime;
    private short nameSize;
    private int recoverySectors;
    private final byte[] salt;
    private byte[] subData;
    private int subFlags;
    private byte unpMethod;
    private final long unpSize;
    private byte unpVersion;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: com.github.junrar.rarfile.FileHeader$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class TimePositionTuple {
        private final int position;
        private final java.nio.file.attribute.FileTime time;

        private TimePositionTuple(int r1, java.nio.file.attribute.FileTime r2) {
                r0 = this;
                r0.<init>()
                r0.position = r1
                r0.time = r2
                return
        }

        public /* synthetic */ TimePositionTuple(int r1, java.nio.file.attribute.FileTime r2, com.github.junrar.rarfile.FileHeader.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ java.nio.file.attribute.FileTime access$000(com.github.junrar.rarfile.FileHeader.TimePositionTuple r0) {
                java.nio.file.attribute.FileTime r0 = r0.time
                return r0
        }

        public static /* synthetic */ int access$100(com.github.junrar.rarfile.FileHeader.TimePositionTuple r0) {
                int r0 = r0.position
                return r0
        }
    }

    static {
            java.lang.Class<com.github.junrar.rarfile.FileHeader> r0 = com.github.junrar.rarfile.FileHeader.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.rarfile.FileHeader.logger = r0
            return
    }

    public FileHeader(com.github.junrar.rarfile.BlockHeader r13, byte[] r14) {
            r12 = this;
            r12.<init>(r13)
            r13 = 8
            byte[] r0 = new byte[r13]
            r12.salt = r0
            r0 = -1
            r12.recoverySectors = r0
            r0 = 0
            long r1 = com.github.junrar.io.Raw.readIntLittleEndianAsLong(r14, r0)
            r12.unpSize = r1
            r3 = 4
            r4 = r14[r3]
            com.github.junrar.rarfile.HostSystem r4 = com.github.junrar.rarfile.HostSystem.findHostSystem(r4)
            r12.hostOS = r4
            r4 = 5
            int r4 = com.github.junrar.io.Raw.readIntLittleEndian(r14, r4)
            r12.fileCRC = r4
            r4 = 9
            int r5 = com.github.junrar.io.Raw.readIntLittleEndian(r14, r4)
            byte r6 = r12.unpVersion
            r7 = 13
            r7 = r14[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            byte r6 = (byte) r6
            r12.unpVersion = r6
            byte r6 = r12.unpMethod
            r7 = 14
            r7 = r14[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            byte r6 = (byte) r6
            r12.unpMethod = r6
            r6 = 15
            short r6 = com.github.junrar.io.Raw.readShortLittleEndian(r14, r6)
            r12.nameSize = r6
            r6 = 17
            int r6 = com.github.junrar.io.Raw.readIntLittleEndian(r14, r6)
            r12.fileAttr = r6
            boolean r6 = r12.isLargeBlock()
            r7 = 21
            if (r6 == 0) goto L6a
            int r6 = com.github.junrar.io.Raw.readIntLittleEndian(r14, r7)
            r12.highPackSize = r6
            r6 = 25
            int r6 = com.github.junrar.io.Raw.readIntLittleEndian(r14, r6)
            r12.highUnpackSize = r6
            r7 = 29
            goto L79
        L6a:
            r12.highPackSize = r0
            r12.highUnpackSize = r0
            r8 = -1
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 != 0) goto L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            r12.highUnpackSize = r6
        L79:
            long r8 = r12.fullPackSize
            int r6 = r12.highPackSize
            long r10 = (long) r6
            long r8 = r8 | r10
            r6 = 32
            long r8 = r8 << r6
            r12.fullPackSize = r8
            long r10 = r12.getPackSize()
            long r8 = r8 | r10
            r12.fullPackSize = r8
            long r8 = r12.fullUnpackSize
            int r10 = r12.highUnpackSize
            long r10 = (long) r10
            long r8 = r8 | r10
            long r8 = r8 << r6
            long r8 = r8 + r1
            r12.fullUnpackSize = r8
            short r1 = r12.nameSize
            r2 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r2) goto L9c
            r1 = r2
        L9c:
            r12.nameSize = r1
            if (r1 <= 0) goto L1d6
            byte[] r2 = new byte[r1]
            r12.fileNameBytes = r2
            java.lang.System.arraycopy(r14, r7, r2, r0, r1)
            short r1 = r12.nameSize
            int r7 = r7 + r1
            boolean r1 = r12.isFileHeader()
            if (r1 == 0) goto L10a
            boolean r1 = r12.isUnicode()
            java.lang.String r8 = ""
            if (r1 == 0) goto Lde
            r1 = r0
        Lb9:
            byte[] r2 = r12.fileNameBytes
            int r9 = r2.length
            if (r1 >= r9) goto Lc5
            r9 = r2[r1]
            if (r9 == 0) goto Lc5
            int r1 = r1 + 1
            goto Lb9
        Lc5:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2, r0, r1)
            r12.fileName = r9
            short r2 = r12.nameSize
            if (r1 == r2) goto Ldb
            int r1 = r1 + 1
            byte[] r2 = r12.fileNameBytes
            java.lang.String r1 = com.github.junrar.rarfile.FileNameDecoder.decode(r2, r1)
            r12.fileNameW = r1
            goto Le7
        Ldb:
            r12.fileNameW = r8
            goto Le7
        Lde:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            r12.fileName = r1
            r12.fileNameW = r8
        Le7:
            java.lang.String r1 = r12.getFileName()
            boolean r1 = isFilenameValid(r1)
            if (r1 == 0) goto Lf2
            goto L10a
        Lf2:
            com.github.junrar.exception.CorruptHeaderException r13 = new com.github.junrar.exception.CorruptHeaderException
            java.lang.String r12 = r12.getFileName()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid filename: "
            r14.<init>(r0)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
        L10a:
            com.github.junrar.rarfile.UnrarHeadertype r1 = com.github.junrar.rarfile.UnrarHeadertype.NewSubHeader
            byte r2 = r12.headerType
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L160
            short r1 = r12.headerSize
            int r1 = r1 - r6
            short r2 = r12.nameSize
            int r1 = r1 - r2
            boolean r2 = r12.hasSalt()
            if (r2 == 0) goto L122
            int r1 = r1 + (-8)
        L122:
            if (r1 <= 0) goto L136
            byte[] r2 = new byte[r1]
            r12.subData = r2
            r2 = r0
        L129:
            if (r2 >= r1) goto L136
            byte[] r6 = r12.subData
            r8 = r14[r7]
            r6[r2] = r8
            int r7 = r7 + 1
            int r2 = r2 + 1
            goto L129
        L136:
            com.github.junrar.rarfile.NewSubHeaderType r1 = com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_RR
            byte[] r2 = r12.fileNameBytes
            boolean r1 = r1.byteEquals(r2)
            if (r1 == 0) goto L160
            byte[] r1 = r12.subData
            r2 = r1[r13]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r13
            int r2 = r2 + r4
            r4 = 10
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            int r2 = r2 + r4
            r4 = 11
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r2 = r2 + r1
            r12.recoverySectors = r2
        L160:
            boolean r1 = r12.hasSalt()
            if (r1 == 0) goto L174
            r1 = r0
        L167:
            if (r1 >= r13) goto L174
            byte[] r2 = r12.salt
            r4 = r14[r7]
            r2[r1] = r4
            int r7 = r7 + 1
            int r1 = r1 + 1
            goto L167
        L174:
            long r1 = getDateDos(r5)
            java.nio.file.attribute.FileTime r1 = defpackage.wa2.m(r1)
            r12.mTime = r1
            boolean r1 = r12.hasExtTime()
            if (r1 == 0) goto L1d5
            int r1 = r7 + 1
            int r2 = r14.length
            if (r1 >= r2) goto L190
            short r1 = com.github.junrar.io.Raw.readShortLittleEndian(r14, r7)
            int r7 = r7 + 2
            goto L19a
        L190:
            ry3 r1 = com.github.junrar.rarfile.FileHeader.logger
            java.lang.String r2 = r12.getFileName()
            r1.t(r2)
            r1 = r0
        L19a:
            r2 = 12
            java.nio.file.attribute.FileTime r4 = r12.mTime
            com.github.junrar.rarfile.FileHeader$TimePositionTuple r2 = parseExtTime(r2, r1, r14, r7, r4)
            java.nio.file.attribute.FileTime r4 = com.github.junrar.rarfile.FileHeader.TimePositionTuple.access$000(r2)
            r12.mTime = r4
            int r2 = com.github.junrar.rarfile.FileHeader.TimePositionTuple.access$100(r2)
            com.github.junrar.rarfile.FileHeader$TimePositionTuple r13 = parseExtTime(r13, r1, r14, r2)
            java.nio.file.attribute.FileTime r2 = com.github.junrar.rarfile.FileHeader.TimePositionTuple.access$000(r13)
            r12.cTime = r2
            int r13 = com.github.junrar.rarfile.FileHeader.TimePositionTuple.access$100(r13)
            com.github.junrar.rarfile.FileHeader$TimePositionTuple r13 = parseExtTime(r3, r1, r14, r13)
            java.nio.file.attribute.FileTime r2 = com.github.junrar.rarfile.FileHeader.TimePositionTuple.access$000(r13)
            r12.aTime = r2
            int r13 = com.github.junrar.rarfile.FileHeader.TimePositionTuple.access$100(r13)
            com.github.junrar.rarfile.FileHeader$TimePositionTuple r13 = parseExtTime(r0, r1, r14, r13)
            java.nio.file.attribute.FileTime r14 = com.github.junrar.rarfile.FileHeader.TimePositionTuple.access$000(r13)
            r12.arcTime = r14
            com.github.junrar.rarfile.FileHeader.TimePositionTuple.access$100(r13)
        L1d5:
            return
        L1d6:
            com.github.junrar.exception.CorruptHeaderException r12 = new com.github.junrar.exception.CorruptHeaderException
            java.lang.String r13 = "Invalid file name with negative size"
            r12.<init>(r13)
            throw r12
    }

    private static long getDateDos(int r4) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r1 = r4 >>> 25
            int r1 = r1 + 1980
            r2 = 1
            r0.set(r2, r1)
            int r1 = r4 >>> 21
            r1 = r1 & 15
            int r1 = r1 - r2
            r2 = 2
            r0.set(r2, r1)
            int r1 = r4 >>> 16
            r1 = r1 & 31
            r3 = 5
            r0.set(r3, r1)
            int r1 = r4 >>> 11
            r1 = r1 & 31
            r3 = 11
            r0.set(r3, r1)
            int r1 = r4 >>> 5
            r1 = r1 & 63
            r3 = 12
            r0.set(r3, r1)
            r4 = r4 & 31
            int r4 = r4 * r2
            r1 = 13
            r0.set(r1, r4)
            r4 = 14
            r1 = 0
            r0.set(r4, r1)
            long r0 = r0.getTimeInMillis()
            return r0
    }

    private static boolean isFilenameValid(java.lang.String r1) {
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> La
            r0.<init>(r1)     // Catch: java.io.IOException -> La
            r0.getCanonicalPath()     // Catch: java.io.IOException -> La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static com.github.junrar.rarfile.FileHeader.TimePositionTuple parseExtTime(int r1, short r2, byte[] r3, int r4) {
            r0 = 0
            com.github.junrar.rarfile.FileHeader$TimePositionTuple r1 = parseExtTime(r1, r2, r3, r4, r0)
            return r1
    }

    private static com.github.junrar.rarfile.FileHeader.TimePositionTuple parseExtTime(int r8, short r9, byte[] r10, int r11, java.nio.file.attribute.FileTime r12) {
            int r8 = r9 >>> r8
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L4b
            if (r12 == 0) goto Le
            long r1 = defpackage.wa2.c(r12)
            goto L1b
        Le:
            int r9 = com.github.junrar.io.Raw.readIntLittleEndian(r10, r11)
            long r1 = getDateDos(r9)
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            int r11 = r11 + 4
        L1b:
            r9 = r8 & 3
            r3 = 0
            r12 = 0
        L20:
            if (r12 >= r9) goto L32
            r5 = r10[r11]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            long r5 = (long) r5
            r7 = 8
            long r3 = r3 >>> r7
            long r3 = r3 | r5
            int r11 = r11 + 1
            int r12 = r12 + 1
            goto L20
        L32:
            r9 = 100
            long r3 = r3 * r9
            r8 = r8 & 4
            if (r8 == 0) goto L3d
            r8 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 + r8
        L3d:
            java.time.Instant r8 = defpackage.wa2.r(r1, r3)
            java.nio.file.attribute.FileTime r8 = defpackage.wa2.n(r8)
            com.github.junrar.rarfile.FileHeader$TimePositionTuple r9 = new com.github.junrar.rarfile.FileHeader$TimePositionTuple
            r9.<init>(r11, r8, r0)
            return r9
        L4b:
            com.github.junrar.rarfile.FileHeader$TimePositionTuple r8 = new com.github.junrar.rarfile.FileHeader$TimePositionTuple
            r8.<init>(r11, r12, r0)
            return r8
    }

    private static java.util.Date toDate(java.nio.file.attribute.FileTime r3) {
            if (r3 == 0) goto Lc
            java.util.Date r0 = new java.util.Date
            long r1 = defpackage.wa2.z(r3)
            r0.<init>(r1)
            return r0
        Lc:
            r3 = 0
            return r3
    }

    private static java.nio.file.attribute.FileTime toFileTime(java.util.Date r2) {
            if (r2 == 0) goto Lb
            long r0 = r2.getTime()
            java.nio.file.attribute.FileTime r2 = defpackage.wa2.m(r0)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public java.util.Date getATime() {
            r0 = this;
            java.nio.file.attribute.FileTime r0 = r0.getLastAccessTime()
            java.util.Date r0 = toDate(r0)
            return r0
    }

    public java.util.Date getArcTime() {
            r0 = this;
            java.nio.file.attribute.FileTime r0 = r0.getArchivalTime()
            java.util.Date r0 = toDate(r0)
            return r0
    }

    public java.nio.file.attribute.FileTime getArchivalTime() {
            r0 = this;
            java.nio.file.attribute.FileTime r0 = r0.arcTime
            return r0
    }

    public java.util.Date getCTime() {
            r0 = this;
            java.nio.file.attribute.FileTime r0 = r0.getCreationTime()
            java.util.Date r0 = toDate(r0)
            return r0
    }

    public java.nio.file.attribute.FileTime getCreationTime() {
            r0 = this;
            java.nio.file.attribute.FileTime r0 = r0.cTime
            return r0
    }

    public int getFileAttr() {
            r0 = this;
            int r0 = r0.fileAttr
            return r0
    }

    public int getFileCRC() {
            r0 = this;
            int r0 = r0.fileCRC
            return r0
    }

    public java.lang.String getFileName() {
            r1 = this;
            boolean r0 = r1.isUnicode()
            if (r0 == 0) goto L13
            java.lang.String r0 = r1.fileNameW
            if (r0 == 0) goto L13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            java.lang.String r1 = r1.fileNameW
            return r1
        L13:
            java.lang.String r1 = r1.fileName
            return r1
    }

    public byte[] getFileNameByteArray() {
            r0 = this;
            byte[] r0 = r0.fileNameBytes
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getFileNameString() {
            r0 = this;
            java.lang.String r0 = r0.fileName
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getFileNameW() {
            r0 = this;
            java.lang.String r0 = r0.fileNameW
            return r0
    }

    public long getFullPackSize() {
            r2 = this;
            long r0 = r2.fullPackSize
            return r0
    }

    public long getFullUnpackSize() {
            r2 = this;
            long r0 = r2.fullUnpackSize
            return r0
    }

    public int getHighPackSize() {
            r0 = this;
            int r0 = r0.highPackSize
            return r0
    }

    public int getHighUnpackSize() {
            r0 = this;
            int r0 = r0.highUnpackSize
            return r0
    }

    public com.github.junrar.rarfile.HostSystem getHostOS() {
            r0 = this;
            com.github.junrar.rarfile.HostSystem r0 = r0.hostOS
            return r0
    }

    public java.nio.file.attribute.FileTime getLastAccessTime() {
            r0 = this;
            java.nio.file.attribute.FileTime r0 = r0.aTime
            return r0
    }

    public java.nio.file.attribute.FileTime getLastModifiedTime() {
            r0 = this;
            java.nio.file.attribute.FileTime r0 = r0.mTime
            return r0
    }

    public java.util.Date getMTime() {
            r0 = this;
            java.nio.file.attribute.FileTime r0 = r0.getLastModifiedTime()
            java.util.Date r0 = toDate(r0)
            return r0
    }

    public short getNameSize() {
            r0 = this;
            short r0 = r0.nameSize
            return r0
    }

    public int getRecoverySectors() {
            r0 = this;
            int r0 = r0.recoverySectors
            return r0
    }

    public byte[] getSalt() {
            r0 = this;
            byte[] r0 = r0.salt
            return r0
    }

    public byte[] getSubData() {
            r0 = this;
            byte[] r0 = r0.subData
            return r0
    }

    public int getSubFlags() {
            r0 = this;
            int r0 = r0.subFlags
            return r0
    }

    public byte getUnpMethod() {
            r0 = this;
            byte r0 = r0.unpMethod
            return r0
    }

    public long getUnpSize() {
            r2 = this;
            long r0 = r2.unpSize
            return r0
    }

    public byte getUnpVersion() {
            r0 = this;
            byte r0 = r0.unpVersion
            return r0
    }

    public boolean hasExtTime() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean hasSalt() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isDirectory() {
            r1 = this;
            short r1 = r1.flags
            r0 = 224(0xe0, float:3.14E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public boolean isEncrypted() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isFileHeader() {
            r1 = this;
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.FileHeader
            byte r1 = r1.headerType
            boolean r1 = r0.equals(r1)
            return r1
    }

    public boolean isLargeBlock() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isSolid() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isSplitAfter() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isSplitBefore() {
            r1 = this;
            short r1 = r1.flags
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    public boolean isUnicode() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
            r4 = this;
            super.print()
            ry3 r0 = com.github.junrar.rarfile.FileHeader.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto L13e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unpSize: "
            r1.<init>(r2)
            long r2 = r4.getUnpSize()
            r1.append(r2)
            java.lang.String r2 = "\nHostOS: "
            r1.append(r2)
            com.github.junrar.rarfile.HostSystem r2 = r4.hostOS
            java.lang.String r2 = r2.name()
            r1.append(r2)
            java.lang.String r2 = "\nMTime: "
            r1.append(r2)
            java.nio.file.attribute.FileTime r2 = r4.mTime
            r1.append(r2)
            java.lang.String r2 = "\nCTime: "
            r1.append(r2)
            java.nio.file.attribute.FileTime r2 = r4.cTime
            r1.append(r2)
            java.lang.String r2 = "\nATime: "
            r1.append(r2)
            java.nio.file.attribute.FileTime r2 = r4.aTime
            r1.append(r2)
            java.lang.String r2 = "\nArcTime: "
            r1.append(r2)
            java.nio.file.attribute.FileTime r2 = r4.arcTime
            r1.append(r2)
            java.lang.String r2 = "\nFileName: "
            r1.append(r2)
            java.lang.String r2 = r4.fileName
            r1.append(r2)
            java.lang.String r2 = "\nFileNameW: "
            r1.append(r2)
            java.lang.String r2 = r4.fileNameW
            r1.append(r2)
            java.lang.String r2 = "\nunpMethod: "
            r1.append(r2)
            byte r2 = r4.getUnpMethod()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = "\nunpVersion: "
            r1.append(r2)
            byte r2 = r4.getUnpVersion()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = "\nfullpackedsize: "
            r1.append(r2)
            long r2 = r4.getFullPackSize()
            r1.append(r2)
            java.lang.String r2 = "\nfullunpackedsize: "
            r1.append(r2)
            long r2 = r4.getFullUnpackSize()
            r1.append(r2)
            java.lang.String r2 = "\nisEncrypted: "
            r1.append(r2)
            boolean r2 = r4.isEncrypted()
            r1.append(r2)
            java.lang.String r2 = "\nisfileHeader: "
            r1.append(r2)
            boolean r2 = r4.isFileHeader()
            r1.append(r2)
            java.lang.String r2 = "\nisSolid: "
            r1.append(r2)
            boolean r2 = r4.isSolid()
            r1.append(r2)
            java.lang.String r2 = "\nisSplitafter: "
            r1.append(r2)
            boolean r2 = r4.isSplitAfter()
            r1.append(r2)
            java.lang.String r2 = "\nisSplitBefore:"
            r1.append(r2)
            boolean r2 = r4.isSplitBefore()
            r1.append(r2)
            java.lang.String r2 = "\nunpSize: "
            r1.append(r2)
            long r2 = r4.getUnpSize()
            r1.append(r2)
            java.lang.String r2 = "\ndataSize: "
            r1.append(r2)
            long r2 = r4.getDataSize()
            r1.append(r2)
            java.lang.String r2 = "\nisUnicode: "
            r1.append(r2)
            boolean r2 = r4.isUnicode()
            r1.append(r2)
            java.lang.String r2 = "\nhasVolumeNumber: "
            r1.append(r2)
            boolean r2 = r4.hasVolumeNumber()
            r1.append(r2)
            java.lang.String r2 = "\nhasArchiveDataCRC: "
            r1.append(r2)
            boolean r2 = r4.hasArchiveDataCRC()
            r1.append(r2)
            java.lang.String r2 = "\nhasSalt: "
            r1.append(r2)
            boolean r2 = r4.hasSalt()
            r1.append(r2)
            java.lang.String r2 = "\nhasEncryptVersions: "
            r1.append(r2)
            boolean r2 = r4.hasEncryptVersion()
            r1.append(r2)
            java.lang.String r2 = "\nisSubBlock: "
            r1.append(r2)
            boolean r4 = r4.isSubBlock()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.o(r4)
        L13e:
            return
    }

    public void setATime(java.util.Date r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = toFileTime(r1)
            r0.setLastAccessTime(r1)
            return
    }

    public void setArcTime(java.util.Date r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = toFileTime(r1)
            r0.setArchivalTime(r1)
            return
    }

    public void setArchivalTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.arcTime = r1
            return
    }

    public void setCTime(java.util.Date r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = toFileTime(r1)
            r0.setCreationTime(r1)
            return
    }

    public void setCreationTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.cTime = r1
            return
    }

    public void setFileAttr(int r1) {
            r0 = this;
            r0.fileAttr = r1
            return
    }

    public void setFileName(java.lang.String r1) {
            r0 = this;
            r0.fileName = r1
            return
    }

    public void setFileNameW(java.lang.String r1) {
            r0 = this;
            r0.fileNameW = r1
            return
    }

    public void setLastAccessTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.aTime = r1
            return
    }

    public void setLastModifiedTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.mTime = r1
            return
    }

    public void setMTime(java.util.Date r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = toFileTime(r1)
            r0.setLastModifiedTime(r1)
            return
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
